package geeksforgeeks.arrays;

import java.io.PrintWriter;
import java.util.Scanner;

class WaveArraySorted {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = scanner.nextInt();
    while (testCases-- > 0) {
      int n = scanner.nextInt();
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
      }
      writer.println(waveArray(array, n));
    }

    scanner.close();
    writer.close();
  }

  private static String waveArray(int[] array, int n) {
    if (n < 2) {
      return String.format("%d %d", array[0], array[1]);
    }
    int i = 0;
    int j = 1;
    while (i < n && j < n) {
      swap(array, i, j);
      i += 2;
      j += 2;
    }

    StringBuilder str = new StringBuilder();
    for (int t : array) {
      str.append(t).append(' ');
    }
    return str.toString();
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
