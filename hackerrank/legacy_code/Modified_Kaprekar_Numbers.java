// N time N space

import java.io.PrintWriter;
import java.util.Scanner;

class Modified_Kaprekar_Numbers {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long p = scanner.nextLong();
        long q = scanner.nextLong();
        int counter = 0;

        // to keep track of digits per number
        int digits = getDigits(p);
        // it will reduce efforts of counting digits every time
        // eg. for numbers 1 to 9, only 10 is a bigger number; so digits will be 1 to start with..
        // when number will be 10, next bigger number will be three, and digit/s will be digits + 1
        int nextBigger010 = 1;
        for (int i = 0; i < digits; i++) {
            nextBigger010 *= 10;
        }

        for (long i = p; i <= q; i++) {
            // optimized digit calculation for each number
            if (i == nextBigger010) {
                digits++;
                nextBigger010 *= 10;
            }

            long square = i * i;
            int sqrdigits = getDigits(square);
            int[] array = intToArray(square, sqrdigits);
            if (isKaprekar(i, array, digits, sqrdigits)) {
                counter++;
                pw.print(i + " ");
            }
        }
        pw.println(counter == 0 ? "INVALID RANGE" : "");

        pw.close();
        scanner.close();
    }

    private static boolean isKaprekar(long i, int[] array, int digits, int sqrdigits) {
        long p = 0;
        long q = 0;
        // right side should have digits number of digits, and left side should have digits / digits - 1 digits
        if (sqrdigits % 2 != 0)
            digits--;

        for (int j = 0; j < digits; j++)
            p = p * 10 + array[j];

        for (int j = digits; j < array.length; j++)
            q = q * 10 + array[j];

        return p + q == i;
    }

    private static int getDigits(long p) {
        if (p == 0)
            return 1;

        int digits = 0;
        while (p != 0) {
            digits++;
            p /= 10;
        }

        return digits;
    }

    private static int[] intToArray(long square, int sqrlen) {
        int[] array = new int[sqrlen];
        int i = 0;
        while (square != 0) {
            array[i++] = (int) (square % 10);
            square /= 10;
        }
        // flip the array
        --i;
        int j = 0;
        while (i > j) {
            swap(i--, j++, array);
        }
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}