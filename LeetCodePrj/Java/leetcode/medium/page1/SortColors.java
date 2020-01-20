package leetcode.medium.page1;

public class SortColors {
    public void sortColors(int[] nums) {
        int p = 0;

        for (int i = 0; i <= 2; i++) {
            for (int q = p; q < nums.length; q++) {
                if (nums[q] == i) {
                    int tmp = nums[p];
                    nums[p] = nums[q];
                    nums[q] = tmp;
                    p++;
                }
            }
        }
    }
}
