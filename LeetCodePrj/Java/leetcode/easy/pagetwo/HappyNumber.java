package leetcode.easy.pagetwo;

/**
 * @author Kyle
 * @create 2018/9/5 2:01
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumSquareOfDigits(slow);
            fast = sumSquareOfDigits(fast);
            fast = sumSquareOfDigits(fast);
        } while (slow != fast && fast != 1);

        if(fast == 1) {
            return true;
        }
        return false;
    }

    private int sumSquareOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }

        return sum;
    }
}
