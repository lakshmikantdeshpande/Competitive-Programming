import java.io.PrintWriter;
import java.util.Scanner;

public class Forming_a_Magic_Square {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] matrix = new int[9];
        int[] sums = new int[8];

        // all possible magic squares
        int[][] finalPatterns = {{8, 1, 6, 3, 5, 7, 4, 9, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 7, 6, 9, 5, 1, 4, 3, 8}};

        for (int i = 0; i < 9; i++)
            matrix[i] = scanner.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (finalPatterns[i][j] != matrix[j]) {
                    sums[i] = sums[i] + Math.abs(matrix[j] - finalPatterns[i][j]);
                }
            }
        }

        int result = sums[0];

        for (int i = 1; i < 8; i++) {
            if (sums[i] < result) {
                result = sums[i];
            }
        }

        pw.println(result);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

}
