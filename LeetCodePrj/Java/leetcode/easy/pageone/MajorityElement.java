package leetcode.easy.pageone;

/**
 * @author Kyle
 * @create 2018/8/30 1:46
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == major) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }
}
