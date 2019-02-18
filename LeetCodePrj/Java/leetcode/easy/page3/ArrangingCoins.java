package leetcode.easy.page3;

public class ArrangingCoins {

    private final int maxRow = 65537;

    public int arrangeCoins(int n) {
        return (int) Math.sqrt(1 + 8 * n);
    }
}
