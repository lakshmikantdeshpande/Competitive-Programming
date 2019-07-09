package leetcode.google;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        final int N = digits.length;
        int[] withCarry = new int[N + 1];
        int[] withoutCarry = new int[N];
        int carry = 1;

        for (int i = N - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            withCarry[i] = withoutCarry[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            withCarry[0] = carry;
            return withCarry;
        }
        return withoutCarry;
    }
}
