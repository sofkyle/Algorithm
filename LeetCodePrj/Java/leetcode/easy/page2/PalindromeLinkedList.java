package leetcode.easy.page2;

import leetcode.common.ListNode;

import java.util.Stack;

/**
 * @author Kyle
 * @create 2018/9/24 23:00
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode tmp = head;

        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }

        // check whether even or not
        boolean isEven = len % 2 == 0;
        Stack<Integer> stack = new Stack<>();
        int pillar = (len + 1) / 2;

        for (int i = 0; i < pillar; i++) {
            stack.push(head.val);
            if (isEven || (!isEven && i < pillar - 1)) {
                head = head.next;
            }
        }

        for (int i = (isEven ? pillar : pillar - 1); i < len; i++) {
            if (stack.pop().intValue() != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
