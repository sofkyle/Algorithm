package leetcode.easy.pagetwo;

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

        int[] route = new int[length];
        route[0] = nums[0];
        route[1] = nums[1];

        for(int i = 2; i < length; i++) {
            for(int j = i - 2; j >= 0; j--) {
                route[i] = Math.max(route[i], nums[i] + route[j]);
            }
        }

        int maxRoute = 0;
        for(int i = 0; i < length; i++) {
            maxRoute = Math.max(route[i], maxRoute);
        }

        return maxRoute;
    }
}
