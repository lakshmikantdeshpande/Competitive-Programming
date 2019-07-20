package leetcode;

public class BestTimeToBuyAndSellStockTwo {
    private static class Interval {
        int buy;
        int sell;
    }

    public int maxProfit(int[] prices) {
        final int n = prices.length;
        int maxProfit = 0;

        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }

            if (i == n - 1) break;

            Interval interval = new Interval();
            interval.buy = i++;

            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }
            interval.sell = i - 1;
            maxProfit += prices[interval.sell] - prices[interval.buy];
        }
        return maxProfit;
    }
}
