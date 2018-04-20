package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Kyle
 * @create 2018/4/12 2:45
 */
public class Easy {

    @Test
    public void twoSum() {
         TwoSum twoSum =  new TwoSum();
         int nums[] = {2, 7, 11, 15};
         int target = 9;
         System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }

    @Test
    public void searchInsert() {
        SearchInsert searchInsert = new SearchInsert();
        int nums[] = {1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert.searchInsert(nums, target));
    }

    @Test
    public void countAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        int n = 3;
        System.out.println(countAndSay.countAndSay(n));
    }

    @Test
    public void maxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = {-1};
        System.out.println(maxSubArray.maxSubArray(nums));
    }

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String str = " ";
        System.out.println(lengthOfLastWord.lengthOfLastWord(str));
    }

    @Test
    public void plusOne() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }

    @Test
    public void sqrtX() {
        SqrtX sqrtX = new SqrtX();
        int x = 4;
        System.out.println(sqrtX.sqrt(x));
    }

    @Test
    public void climbStairs() {
        ClimbStairs climbStairs = new ClimbStairs();
        int n = 44;
        Long begin = System.currentTimeMillis();
        System.out.println(climbStairs.climbStairs(n));
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Test
    public void deleteDuplicates() {
        DeleteDuplicates.ListNode listNodeOne = new DeleteDuplicates.ListNode(1);
        listNodeOne.next = new DeleteDuplicates.ListNode(1);
        listNodeOne.next.next = new DeleteDuplicates.ListNode(1);
        listNodeOne.next.next.next = new DeleteDuplicates.ListNode(1);
        listNodeOne.next.next.next.next = new DeleteDuplicates.ListNode(1);
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        DeleteDuplicates.ListNode head = deleteDuplicates.deleteDuplicates(listNodeOne);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    public void mergeSortedArray() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
