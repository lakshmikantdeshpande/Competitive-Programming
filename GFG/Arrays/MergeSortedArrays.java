/*package whatever //do not write package name here */

import java.io.PrintWriter;
import java.util.Scanner;

class MergeSortedArrays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int T = scanner.nextInt();

    while (T-- > 0) {
      int X = scanner.nextInt();
      int Y = scanner.nextInt();

      // Input
      int[] P = new int[X];
      int[] Q = new int[Y];

      for (int i = 0; i < X; i++) {
        P[i] = scanner.nextInt();
      }

      for (int i = 0; i < Y; i++) {
        Q[i] = scanner.nextInt();
      }

      // Logic

      int i = 0;
      int j = 0;
      int k = 0; // Pointer for output array
      int[] R = new int[X + Y];
      while (i < P.length && j < Q.length) {
        if (P[i] <= Q[j]) {
          R[k++] = P[i++];
        } else {
          R[k++] = Q[j++];
        }
      }

      while (i < P.length) {
        R[k++] = P[i++];
      }
      while (j < Q.length) {
        R[k++] = Q[j++];
      }

      for (int z : R) {
        pw.print(z + " ");
      }
      pw.println();

    }
    pw.close();
    scanner.close();
  }
}