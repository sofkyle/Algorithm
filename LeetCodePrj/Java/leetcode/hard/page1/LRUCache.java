package leetcode.hard.page1;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    ListNode cacheListHead;
    ListNode cacheListTail;

    Map<Integer, Integer> cache = new HashMap<>();
    int count = 0;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (count == 0 || !cache.containsKey(key)) return -1;

        moveToHead(key);

        return cache.get(cacheListHead.val);
    }

    public void put(int key, int value) {
        if (!cache.containsKey(key)) {
            if (count < capacity) {
                // the max count is equals to capacity
                count++;

                ListNode node = new ListNode(key);
                if (cacheListHead == null) {
                    cacheListHead = node;
                    cacheListTail = node;
                } else {
                    node.next = cacheListHead;
                    cacheListHead = node;
                }
            } else {
                cache.remove(cacheListTail.val);

                ListNode newNode = new ListNode(key);
                newNode.next = cacheListHead;
                cacheListHead = newNode;

                ListNode tmpNode = cacheListHead;
                while (tmpNode.next != cacheListTail) {
                    tmpNode = tmpNode.next;
                }

                tmpNode.next = null;
                cacheListTail = tmpNode;
            }
        } else {
            moveToHead(key);
        }
        cache.put(key, value);
    }

    private void moveToHead(int key) {
        if (cacheListHead.val == key) {
            return;
        }

        ListNode p = cacheListHead;
        ListNode q = p.next;
        while (q.val != key) {
            p = q;
            q = p.next;
        }

        // move q to head
        p.next = q.next;
        q.next = cacheListHead;
        cacheListHead = q;
        if (p.next == null) cacheListTail = p;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
