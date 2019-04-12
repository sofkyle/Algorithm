package practice;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

public class Practice {
    @Test
    public void testNull() {
        /*ListNode a = null;
        swap(a);
        System.out.println(a);*/

        ListNode b = new ListNode(2);
        swap(b);
        System.out.println(b.val);
    }

    private void swap(ListNode i) {
        i.next = new ListNode(-1);
    }
}
