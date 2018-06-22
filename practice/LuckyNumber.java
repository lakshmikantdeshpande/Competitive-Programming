package practice;

public class LuckyNumber {

    public static void main(String[] args) {
        System.out.println(luckyNumber(841993));
    }

    private static int luckyNumber(int number) {
        if (number < 10) {
            return number;
        }

        return luckyNumber(sum(number));
    }

    private static int sum(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

}
