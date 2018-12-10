package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/10/7 10:15
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (1 + len) * len / 2;

        int actSum = 0;
        for (int i : nums) {
            actSum += i;
        }

        return sum - actSum;
    }
}
