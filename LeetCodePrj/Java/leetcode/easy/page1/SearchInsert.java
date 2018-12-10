package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/4/12 3:47
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        // if don't get a result after traversing the array, return the last index
        int result = nums.length;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < target) {
                continue;
            } else {
                return i;
            }
        }
        return result;
    }
}
