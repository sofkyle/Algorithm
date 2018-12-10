package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/10/7 12:07
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
