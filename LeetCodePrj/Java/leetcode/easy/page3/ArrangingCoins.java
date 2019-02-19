package leetcode.easy.page3;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt(1 + 8l * n) - 1) / 2);
    }
}
