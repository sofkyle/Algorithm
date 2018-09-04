package leetcode.easy.pagetwo;

/**
 * @author Kyle
 * @create 2018/9/3 23:52
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int length = nums.length;

        if(length == 1) {
            return nums[0];
        }

        if(length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return 0;
    }
}
