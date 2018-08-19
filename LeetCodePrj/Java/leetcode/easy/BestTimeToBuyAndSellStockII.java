package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/19 13:13
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;

        int valley = prices[0];
        int peak = prices[0];
        int i = 1;
        while (i < prices.length - 1) {
            // find valley
            while (prices[i] < prices[i - 1] && i < prices.length - 1) {
                i++;
            }
            valley = prices[i - 1];

            // find peak
            while (prices[i] > prices[i - 1] && i < prices.length) {
                i++;
            }
            peak = prices[i - 1];

            maxprofit += peak - valley;
        }

        return maxprofit;
    }
}
