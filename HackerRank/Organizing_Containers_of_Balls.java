// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Organizing_Containers_of_Balls {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        while (N-- > 0) {
            int n = scanner.nextInt();
            long[][] matrix = new long[n][n];
            long sum = 0; // sum of all colors except current color

            // take matrix as input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextLong();
                    if (i != j)
                        sum += matrix[i][j];
                }
            }

            pw.println(sum % 2 == 0 ? "Possible" : "Impossible");
        }

        pw.close();
        scanner.close();
    }
}
