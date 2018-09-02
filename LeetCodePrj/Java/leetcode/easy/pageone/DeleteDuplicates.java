package leetcode.easy.pageone;

/**
 * @author Kyle
 * @create 2018/4/17 23:43
 */
public class DeleteDuplicates {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode traverseNode = head;

        while(traverseNode != null && traverseNode.next != null) {
            if(traverseNode.val == traverseNode.next.val) {
                traverseNode.next = traverseNode.next.next;
            }
            if(traverseNode.next != null && traverseNode.val != traverseNode.next.val) {
                traverseNode = traverseNode.next;
            }
        }
        return head;
    }
}
