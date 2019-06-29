package leetcode.google;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int[] answer = new int[digits.length];
        int[] answerWithCarry = new int[digits.length + 1];

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + carry;
            answer[i] = answerWithCarry[i + 1] = temp % 10;
            carry = temp / 10;
        }

        if (carry == 1) {
            answerWithCarry[0] = 1;
            return answerWithCarry;
        }
        return answer;
    }
}
