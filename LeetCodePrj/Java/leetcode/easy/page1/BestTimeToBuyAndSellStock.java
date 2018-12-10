package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/8/19 12:46
 */
public class BestTimeToBuyAndSellStock {
    /*public int maxProfit(int[] prices) {
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
    }*/

    /** Optimize **/
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // current maximun profit = Max(current selling price - minimun buying price in the past, maximum profit in the past)
        int minPrice = prices[0];
        for(int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            minPrice = Math.min(prices[i], minPrice);
        }

        return maxProfit;
    }
}
