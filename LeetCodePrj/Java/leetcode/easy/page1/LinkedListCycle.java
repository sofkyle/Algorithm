package leetcode.easy.page1;

import leetcode.common.ListNode;

/**
 * @author Kyle
 * @create 2018/8/23 1:08
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast != null && slow == fast) {
                return true;
            }
        }

        return false;
    }
}
