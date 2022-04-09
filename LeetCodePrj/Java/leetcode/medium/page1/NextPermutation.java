package leetcode.medium.page1;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 1;

        while (i > 0 && nums[i - 1] >= nums[i]) i--;

        if (i != 0) {
            int j = i;
            while (j < len && nums[i - 1] < nums[j]) j++;

            int tmp = nums[i - 1];
            nums[i - 1] = nums[j - 1];
            nums[j - 1] = tmp;
        }

        Arrays.sort(nums, i, nums.length);
    }
}
