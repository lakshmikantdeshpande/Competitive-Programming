package leetcode.jpmorgan;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int num : prices) {
            if (num < min) {
                min = num;
            } else if (num - min > max) {
                max = num - min;
            }
        }
        return max;
    }
}
