package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/4/13 8:23
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
