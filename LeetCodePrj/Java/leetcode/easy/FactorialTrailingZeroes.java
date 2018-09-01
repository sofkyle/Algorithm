package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/31 1:32
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 4){
            n = n/5;
            count = count + n;
        }

        return count;
    }
}
