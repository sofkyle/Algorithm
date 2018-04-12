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
}
