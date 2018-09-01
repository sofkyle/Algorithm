package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/31 1:32
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int zerosNum = 0;

        for(int i = 0; i <= n; i+=5) {
            if(i != 0) {
                zerosNum += getCountsOfFive(i);
            }
        }

        return zerosNum;
    }

    private int getCountsOfFive(int i) {
        int count = 0;

        while (i % 5 == 0) {
            count++;
            i /= 5;
        }
        return count;
    }
}
