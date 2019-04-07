package leetcode.hard.page1;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

public class HardPage1 {
    @Test
    public void testLRUCache() {
        /*LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.put(4,4);
        lruCache.get(4);
        lruCache.get(3);
        lruCache.get(2);
        lruCache.get(1);
        lruCache.put(5,5);
        lruCache.get(1);
        lruCache.get(2);
        lruCache.get(3);
        lruCache.get(4);
        lruCache.get(5);*/

        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2,1);
        lruCache.put(1,1);
        lruCache.put(2,3);
        lruCache.put(4,1);
        lruCache.get(1);
        lruCache.get(2);
    }

    @Test
    public void testMergeKSortedLists() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        ListNode node3 = new ListNode(2);
        node3.next = new ListNode(6);

        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode[] lists = new ListNode[] {node1, node2, node3};

        ListNode[] lists2 = new ListNode[] {null, null};
        System.out.println(mergeKSortedLists.mergeKLists(lists2));;
    }
}
