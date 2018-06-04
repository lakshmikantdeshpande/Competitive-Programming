package hackerrank.hackerrank.reboot;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoD_Array_DS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int maxHourglassSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassSum = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                maxHourglassSum = Math.max(maxHourglassSum, hourglassSum);
            }
        }
        pw.println(maxHourglassSum);

        pw.close();
        scanner.close();
    }

}
