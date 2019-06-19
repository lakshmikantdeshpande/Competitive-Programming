package geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ClockwiseRotateArray {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(reader.readLine());
    while (testCases-- > 0) {
      int n = Integer.parseInt(reader.readLine());
      int[][] matrix = new int[n][n];
      String[] tokens = reader.readLine().split(" ");
      int k = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          matrix[i][j] = Integer.parseInt(tokens[k++]);
        }
      }
      rotate(matrix, n);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          writer.print(matrix[i][j] + " ");
        }
      }
      writer.println();
    }

    reader.close();
    writer.close();
  }

  private static void rotate(int[][] matrix, int n) {
    for (int i = 0; i < n / 2; i++) {
      for (int j = i; j < n - i - 1; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = temp;
      }
    }
  }
}