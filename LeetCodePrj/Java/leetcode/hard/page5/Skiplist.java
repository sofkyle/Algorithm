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
            while (Objects.nonNull(p.next[i]) && p.next[i].data < target) {
                p = p.next[i];
            }
        }

        if (Objects.nonNull(p.next[0]) && p.next[0].data == target) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int num) {
        int level = Objects.isNull(head.next[0]) ? 1 : randomLevel();

        if (level > levelCount) {
            level = ++levelCount;
        }
        Node newNode = new Node(level);
        newNode.data = num;
        Node update[] = new Node[level];
        for (int i = 0; i < level; ++i) {
            update[i] = head;
        }

        Node p = head;
        for (int i = level - 1; i >= 0; --i) {
            while (Objects.nonNull(p.next[i]) && p.next[i].data < num) {
                p = p.next[i];
            }
            update[i] = p;
        }

        for (int i = 0; i < level; ++i) {
            newNode.next[i] = update[i].next[i];
            update[i].next[i] = newNode;
        }
    }

    public boolean erase(int num) {
        Node[] update = new Node[levelCount];
        Node p = head;
        for (int i = levelCount - 1; i >= 0; --i) {
            while (Objects.nonNull(p.next[i]) && p.next[i].data < num) {
                p = p.next[i];
            }
            update[i] = p;
        }

        if (Objects.nonNull(p.next[0]) && p.next[0].data == num) {
            for (int i = levelCount - 1; i >= 0; --i) {
                if (Objects.nonNull(update[i].next[i]) && update[i].next[i].data == num) {
                    update[i].next[i] = update[i].next[i].next[i];
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Need to optimize
     * @return
     */
    private int randomLevel() {
        return (int) Math.floor(r.nextInt(MAX_LEVEL)) + 1;
    }

    class Node {
        private int data = -1;

        private Node[] next;

        public Node(int level) {
            next = new Node[level];
        }
    }
}
