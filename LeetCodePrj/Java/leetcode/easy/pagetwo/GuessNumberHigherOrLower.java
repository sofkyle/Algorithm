package leetcode.easy.pagetwo;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        int status = 1;
        int result = 0;

        while (status != 0) {
            result = left + (right - left) / 2;
            status = guess(result);

            if (status == 1) {
                left = result + 1;
            }
            if (status == -1) {
                right = result - 1;
            }
        }

        return result;
    }

    private int guess(int num) {
        return 0;
    }
}
