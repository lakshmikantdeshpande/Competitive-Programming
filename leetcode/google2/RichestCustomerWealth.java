package leetcode.google2;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account) {
                sum += money;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
