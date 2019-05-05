package CC.competitions.LTIME70B;

import java.io.PrintWriter;
import java.util.Scanner;

class POGOSTCK {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int K = scanner.nextInt();

      int[] array = new int[N];
      for (int i = 0; i < N; i++) {
        array[i] = scanner.nextInt();
      }
      writer.println(solve(N, K, array));
    }

    scanner.close();
    writer.close();
  }

  private static int solve(int N, int K, int[] array) {
    int[] sums = new int[N];
    int max = Integer.MIN_VALUE;
    int i;
    for (i = N - 1; i >= 0 && i > N - K - 1; i--) {
      sums[i] = array[i];
      max = Math.max(max, sums[i]);
    }

    int j = N - 1;
    while (i >= 0) {
      sums[i] = array[i] + sums[j];
      max = Math.max(sums[i], max);
      i--;
      j--;
    }
    return max;
  }
}