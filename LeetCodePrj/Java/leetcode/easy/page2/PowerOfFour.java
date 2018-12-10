package leetcode.easy.page2;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        while (num % 4 == 0) {
            num >>= 2;
        }

        if (num == 1) return true;
        else return false;
    }
}
