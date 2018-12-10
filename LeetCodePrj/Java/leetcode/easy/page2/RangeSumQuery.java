package leetcode.easy.page2;

public class RangeSumQuery {
    private int[] sums;

    public void NumArray(int[] nums) {
        this.sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? sums[j] : sums[j] - sums[i - 1];
    }
}
