package leetcode.google;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num == 1 || num == 0) return true;

        long left = 0;
        long right = num - 1;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long midSquare = mid * mid;

            if (midSquare == num) {
                return true;
            } else if (midSquare > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
