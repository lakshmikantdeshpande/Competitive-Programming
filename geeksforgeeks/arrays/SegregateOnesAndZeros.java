package geeksforgeeks.arrays;

import java.io.PrintWriter;
import java.util.Scanner;

class SegregateOnesAndZeros {
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
      writer.println(segregateOnesAndZeros(array));
    }

    scanner.close();
    writer.close();
  }

  private static String segregateOnesAndZeros(int[] array) {
    StringBuilder str = new StringBuilder();
    int i = 0;
    int j = array.length - 1;

    while (i < j) {
      if (array[i] == 1 && array[j] == 0) {
        swap(array, i, j);
      }

      if (array[i] == 0) {
        i++;
      }
      if (array[j] == 1) {
        j--;
      }
    }

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