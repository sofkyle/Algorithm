package leetcode.easy.pagetwo;

import leetcode.common.ListNode;

import java.util.Stack;

/**
 * @author Kyle
 * @create 2018/9/16 11:53
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode resultHead = null;

        while (head != null) {
            ListNode tmpNode = head;
            head = head.next;

            tmpNode.next = resultHead;
            resultHead = tmpNode;
        }

        return resultHead;
    }
}
