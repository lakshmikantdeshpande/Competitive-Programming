package leetcode;

public class RotateImage {
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    // should rotate for n/2 times
    for (int i = 0; i < n / 2; i++) {
      for (int j = i; j < n - i - 1; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - j - 1][i];                 // i j
        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1]; // j i
        matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1]; // i j
        matrix[j][n - i - 1] = temp;                         // j i
      }
    }
  }
}
