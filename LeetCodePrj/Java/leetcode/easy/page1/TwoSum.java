package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/4/12 2:44
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        int length = nums.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
