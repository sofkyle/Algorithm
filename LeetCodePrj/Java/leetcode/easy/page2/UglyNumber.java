package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/10/6 22:51
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num == 0) return false;

        while (num % 2 == 0) {
            num >>= 1;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /=5;
        }
        return num == 1;
    }
}
