package GFG.Arrays;

import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayRotationJugglingAlgorithm {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int D = scanner.nextInt();
      int[] array = new int[N];

      for (int q = 0; q < N; q++) array[q] = scanner.nextInt();

      int i = 0;
      for (i = 0; i < gcd(N, D); i++) {
        int temp = array[i];
        int j = i;

        while (true) {
          int k = (j + D);
          if (k >= N) {
            k -= N;
          }
          if (k == i) {
            break;
          }
          array[j] = array[k];
          j = k;
        }
        array[j] = temp;
      }
      for (int p = 0; p < N; p++) writer.print(array[p] + " ");
      writer.println();
    }

    scanner.close();
    writer.close();
  }

  private static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
