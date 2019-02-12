package leetcode.easy.page3;

public class ArrangingCoins {

    private final int maxRow = 65537;

    public int arrangeCoins(int n) {
        int sum = 0;

        for (int i = 1; i <= maxRow; i++) {
            sum += i;
            if (sum > n || sum < 0) {
                return i - 1;
            }
        }

        return 0;
    }
}
