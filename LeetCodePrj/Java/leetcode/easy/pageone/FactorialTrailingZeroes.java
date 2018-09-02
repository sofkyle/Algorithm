package leetcode.easy.pageone;

/**
 * @author Kyle
 * @create 2018/8/31 1:32
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        return n > 5 ? n / 5 + trailingZeroes(n / 5) : 0;
    }
}
