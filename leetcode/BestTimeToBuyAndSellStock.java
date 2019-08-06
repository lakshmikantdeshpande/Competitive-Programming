package leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    private static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i : prices) {
            min = Math.min(i, min);
            max = Math.max(i - min, max);
        }
        return max;
    }

    private static int maxProfitTwo(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > maxProfit)
                maxProfit = prices[i] - min;
        }
        return maxProfit;
    }

}
