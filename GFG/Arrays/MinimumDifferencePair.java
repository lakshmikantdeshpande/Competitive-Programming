package GFG.Arrays;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferencePair {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int[] array = new int[N];
      for (int i = 0; i < N; i++) {
        array[i] = scanner.nextInt();
      }
      Arrays.sort(array);
      int minimumDifference = Integer.MAX_VALUE;
      for (int i = 0; i < N - 1; i++) {
        minimumDifference = Math.min(minimumDifference,
            (array[i + 1] - array[i]));
      }
      writer.println(minimumDifference);
    }

    scanner.close();
    writer.close();
  }
}