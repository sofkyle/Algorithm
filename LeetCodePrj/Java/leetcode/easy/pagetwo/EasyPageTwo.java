package leetcode.easy.pagetwo;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author Kyle
 * @create 2018/9/6 23:47
 */
public class EasyPageTwo {
    @Test
    public void testCountPrimes() {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(10));
    }

    @Test
    public void testPowerOfTwo() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(1));
    }

    @Test
    public void testMyQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        myQueue.pop();
        myQueue.empty();
    }

    @Test
    public void testPalindromeLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        palindromeLinkedList.isPalindrome(head);
    }
}
