package leetcode.paypal;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int i = 0;
        int profit = 0;
        int n = prices.length;
        while (i < n) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }

            if (i == n - 1) {
                break;
            }
            int buy = i++;

            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }
            int sell = i - 1;
            profit += prices[sell] - prices[buy];
        }
        return profit;
    }
}
