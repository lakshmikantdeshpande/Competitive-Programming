package GFG.DynamicProgramming;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class MaximumMoney {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = scanner.nextInt();
    while (testCases-- > 0) {
      int n = scanner.nextInt();
      int money = scanner.nextInt();
      int[] array = new int[n];
      Arrays.fill(array, money);
      writer.println(maxMoney(array, array.length));
    }

    scanner.close();
    writer.close();
  }

  private static int maxMoney(int[] array, int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return array[0];
    } else if (n == 2) {
      return Math.max(array[0], array[1]);
    }

    int one = array[0];
    int two = Math.max(array[0], array[1]);
    int max;

    for (int i = 2; i < n; i++) {
      max = Math.max(array[i] + one, two);
      one = two;
      two = max;
    }
    return two;
  }
}
