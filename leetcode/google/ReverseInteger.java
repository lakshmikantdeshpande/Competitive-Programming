package leetcode.google;

public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long sum = 0;
        int temp = x;

        while (temp > 0) {
            sum = sum * 10 + temp % 10;
            temp /= 10;
        }

        if (sum > Integer.MAX_VALUE) return 0;
        return (int) (sum * (isNegative ? -1 : 1));
    }
}
