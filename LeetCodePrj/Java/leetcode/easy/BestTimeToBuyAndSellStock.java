package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/19 12:46
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // enumerate every possibility
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                // calculae current price
                int curPrice = prices[j] - prices[i];
                if(curPrice > maxProfit) {
                    maxProfit = curPrice;
                }
            }
        }

        return maxProfit;
    }
}
