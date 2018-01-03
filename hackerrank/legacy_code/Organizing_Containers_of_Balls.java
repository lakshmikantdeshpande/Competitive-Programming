// N * N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Organizing_Containers_of_Balls {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        while (N-- > 0) {
            int n = scanner.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];

            // take matrix as input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    long temp = scanner.nextLong();
                    x[i] += temp;
                    y[j] += temp;
                }
            }

            boolean isPossible = true;
            for (int i = 0; i < n; i++) {
                int j = 0;
                for (j = 0; j < n; j++) {
                    if (x[i] == y[j]) {
                        swap(i, j, y);
                        break;
                    }
                }

                if (j == n) {
                    isPossible = false;
                    break;
                }
            }

            pw.println(isPossible ? "Possible" : "Impossible");
        }

        pw.close();
        scanner.close();
    }

    private static void swap(int i, int j, long[] array) {
        long temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
