import java.io.PrintWriter;
import java.util.Scanner;

class Diagonal_Difference {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        int a = 0, b = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
                if (i == j)
                    a += array[i][j];
            }

        for (int i = n - 1, t = 0; i >= 0 && t < n; i--, t++)
            b += array[i][t];

        pw.println(Math.abs(a - b));
        pw.close();
        pw = null;
        array = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}