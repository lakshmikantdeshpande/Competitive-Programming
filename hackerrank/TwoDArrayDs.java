import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArrayDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[j][i] = scanner.nextInt();
            }
        }

        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = array[i][j] + array[i + 1][j] + array[i + 2][j]
                        + array[i + 1][j + 1] + array[i][j + 2] + array[i + 1][j + 2] + array[i + 2][j + 2];
                sum = Math.max(temp, sum);
            }
        }
        printWriter.println(sum);

        scanner.close();
        printWriter.close();
    }
}
