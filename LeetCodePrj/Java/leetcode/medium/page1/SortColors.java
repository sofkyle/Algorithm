package leetcode.medium.page1;

public class SortColors {
    public void sortColors(int[] nums) {
        int[] tmp = new int[nums.length];

        int k = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    tmp[k++] = i;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
    }
}
