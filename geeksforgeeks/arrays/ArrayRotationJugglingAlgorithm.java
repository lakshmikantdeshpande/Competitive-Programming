package geeksforgeeks.arrays;

import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayRotationJugglingAlgorithm {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int n = scanner.nextInt();
      int shift = scanner.nextInt();
      int[] array = new int[n];

      for (int q = 0; q < n; q++) array[q] = scanner.nextInt();

      for (int i = 0; i < gcd(n, shift); i++) {
        int temp = array[i];
        int last = i;

        while (true) {
          int index = (last + shift);
          if (index >= n) {
            index -= n;
          }
          if (index == i) {
            break;
          }
          array[last] = array[index];
          last = index;
        }
        array[last] = temp;
      }
      for (int p = 0; p < n; p++) writer.print(array[p] + " ");
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
