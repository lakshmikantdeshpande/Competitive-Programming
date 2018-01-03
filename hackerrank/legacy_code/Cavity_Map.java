// N time N space

import java.io.PrintWriter;
import java.util.Scanner;

class Cavity_Map {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        int[][] array = new int[N][N];

        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                array[i][j] = Character.getNumericValue(row.charAt(j));
            }
        }

        // if N <= 2, we don't need to check, as only border points will be there that can't be marked as X
        if (N > 2) {
            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < N - 1; j++) {
                    int temp = array[i][j];
                    // surrounding cells must be strictly smaller
                    if (temp > array[i - 1][j] && temp > array[i + 1][j] && temp > array[i][j + 1] && temp > array[i][j - 1])
                        array[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        print(array, pw);

        pw.close();
        scanner.close();
    }

    private static void print(int[][] array, PrintWriter pw) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                pw.print(array[i][j] == Integer.MAX_VALUE ? "X" : array[i][j]);
            }
            pw.println();
        }
    }
}