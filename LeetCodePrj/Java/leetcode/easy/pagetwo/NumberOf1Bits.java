package leetcode.easy.pagetwo;

/**
 * @author Kyle
 * @create 2018/9/2 17:15
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int number = 0;

        for (int i = 0; i < 32; i++) {
            if (((n >>> i) & 1) == 1) {
                number++;
            };
        }

        return number;
    }
}
