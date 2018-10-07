package leetcode.easy.pagetwo;

/**
 * @author Kyle
 * @create 2018/10/7 12:07
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;

        while (i < nums.length - 1) {
            int j = i + 1;
            if (nums[i] != 0) {
                i++;
                j++;
            } else {
                while(j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j == nums.length) {
                    i++;
                    continue;
                }
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }
}
