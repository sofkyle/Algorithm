package leetcode.easy.page2;

import leetcode.common.ListNode;

/**
 * @author Kyle
 * @create 2018/10/5 12:45
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
