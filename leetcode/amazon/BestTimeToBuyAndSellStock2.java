package leetcode.amazon;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        if (prices.length == 1) return 0;

        int maxProfit = 0;
        int i = 0;
        final int n = prices.length;

        while (i < n) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            if (i == n - 1) break;

            int buy = prices[i++];

            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }
            int sell = prices[i - 1];
            maxProfit += sell - buy;
        }
        return maxProfit;
    }
}
