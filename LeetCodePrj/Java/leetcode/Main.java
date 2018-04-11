package leetcode;

import java.util.Arrays;

/**
 * @author Kyle
 * @create 2018/4/12 2:45
 */
public class Main {
    public static void main(String[] args) {
         TwoSum twoSum =  new TwoSum();
         int nums[] = {3, 2, 3};
         int target = 6;
         System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
