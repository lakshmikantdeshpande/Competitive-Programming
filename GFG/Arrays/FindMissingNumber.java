package Arrays;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements (N): ");
        int N = scanner.nextInt();
        System.out.format("Enter %d elements:\n", N - 1);
        int[] array = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.format("\nThe missing number is %d", findMissingNumber1(array, N));
        System.out.format("\nThe missing number is %d", findMissingNumber2(array, N));
        scanner.close();
    }

    private static int findMissingNumber1(int[] array, int N) {
        if (array == null || array.length == 0 || N < array.length) {
            throw new RuntimeException("Null / Empty array or invalid number of elements");
        }

        int x = 0, y = 0;
        for (int i = 0; i < array.length; i++) {
            x ^= array[i];
        }

        // Notice equal sign
        for (int i = 1; i <= N; i++) {
            y ^= i;
        }
        return x ^ y;
    }

    private static int findMissingNumber2(int[] array, int N) {
        if (array == null || array.length == 0 || N < array.length) {
            throw new RuntimeException("Null / Empty array or invalid number of elements");
        }

        int expectedSum = (N * (N + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        return expectedSum - actualSum;
    }

}
