package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/8/19 13:13
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int maxprofit = 0;

        int valley = prices[0];
        int peak = prices[0];
        int i = 1;
        while (i < prices.length) {
            // find valley
            while (i < prices.length && prices[i] <= prices[i - 1]) {
                i++;
            }
            valley = prices[i - 1];

            // find peak
            while (i < prices.length && prices[i] >= prices[i - 1]) {
                i++;
            }
            peak = prices[i - 1];

            maxprofit += peak - valley;
        }

        return maxprofit;
    }
}
