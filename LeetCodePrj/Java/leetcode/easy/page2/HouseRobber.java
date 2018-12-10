package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/9/3 23:52
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int length = nums.length;

        if (nums == null || length == 0) {
            return 0;
        }

        int[] route = new int[length + 1];
        route[0] = 0;
        route[1] = nums[0];

        for(int i = 2; i < length + 1; i++) {
            route[i] = Math.max(route[i - 1], nums[i - 1] + route[i - 2]);
        }

        return route[length];
    }
}
