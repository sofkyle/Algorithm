package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/9/24 9:40
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n != 0) {
            if ((n & 1) == 1) {
                n >>>= 1;
                if (n != 0) {
                    return false;
                } else {
                    return true;
                }
            }
            n >>>= 1;
        }
        return true;
    }
}
