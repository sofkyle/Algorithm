package leetcode.easy;

import java.util.Arrays;

/**
 * @author Kyle
 * @create 2018/8/28 0:21
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] > target) {
                    break;
                }
                if(numbers[i] + numbers[j] ==  target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
