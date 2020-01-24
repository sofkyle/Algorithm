package leetcode.hard.page5;

import java.util.Objects;
import java.util.Random;

public class Skiplist {

    private static final int MAX_LEVEL = 16;
    private Random r = new Random();

    private Node head = new Node(MAX_LEVEL);
    private int levelCount = 1;

    public Skiplist() {

    }

    public boolean search(int target) {
        Node p = head;
        for (int i = levelCount - 1; i >= 0; --i) {
            while (Objects.nonNull(p.forwards[i]) && p.forwards[i].data < target) {
                p = p.forwards[i];
            }
        }

        if (Objects.nonNull(p.forwards[0]) && p.forwards[0].data == target) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int num) {
        int level = Objects.isNull(head.forwards[0]) ? 1 : randomLevel();

        if (level > levelCount) {
            level = ++levelCount;
        }
        Node newNode = new Node(level);
        newNode.data = num;
        Node p = head;

        for (int i = levelCount - 1; i >= 0; --i) {
            while (Objects.nonNull(p.forwards[i]) && p.forwards[i].data < num) {
                p = p.forwards[i];
            }

            if (Objects.isNull(p.forwards[i])) {
                p.forwards[i] = newNode;
            } else {
                Node next = p.forwards[i];
                p.forwards[i] = newNode;
                newNode.forwards[i] = next;
            }
        }

    }

    public boolean erase(int num) {
        Node[] update = new Node[levelCount];
        Node p = head;
        for (int i = levelCount - 1; i >= 0; --i) {
            while (Objects.nonNull(p.forwards[i]) && p.forwards[i].data < num) {
                p = p.forwards[i];
            }
            update[i] = p;
        }

        if (Objects.nonNull(p.forwards[0]) && p.forwards[0].data == num) {
            for (int i = levelCount - 1; i >= 0; --i) {
                if (Objects.nonNull(update[i].forwards[i]) && update[i].forwards[i].data == num) {
                    update[i].forwards[i] = update[i].forwards[i].forwards[i];
                }
            }
        }

        return true;
    }

    private int randomLevel() {
        return (int) Math.floor(r.nextInt(MAX_LEVEL)) + 1;
    }

    class Node {
        private int data = -1;

        private Node[] forwards;

        public Node(int level) {
            forwards = new Node[level];
        }
    }
}
