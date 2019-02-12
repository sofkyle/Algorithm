package leetcode.easy.page3;

public class ArrangingCoins {

    private final int maxRow = 93000;

    public int arrangeCoins(int n) {
        int sum = 0;

        for (int i = 1; i <= maxRow; i++) {
            sum += i;
            if (sum > n) {
                return i - 1;
            }
        }

        return 0;
    }
}
