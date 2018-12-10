package leetcode.easy.page2;

import leetcode.common.ListNode;

/**
 * @author Kyle
 * @create 2018/9/5 23:56
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode behind = head;
        ListNode front = head.next;

        while (front != null) {
            if (front.val == val) {
                behind.next = front;
            } else {
                behind = behind.next;
            }
            front = front.next;
        }

        return head;
    }
}
