package leetcode.easy.page2;

import leetcode.common.ListNode;

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
