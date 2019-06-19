package geeksforgeeks.arrays;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class LeadersInAnArray {
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

      int max = array[N - 1];
      Stack<Integer> stack = new Stack<>();
      stack.push(max);

      for (int i = N - 2; i >= 0; i--) {
        if (array[i] >= max) {
          max = array[i];
          stack.push(max);
        }
      }
      while (!stack.isEmpty()) {
        writer.print(stack.pop() + " ");
      }
      writer.println();
    }

    scanner.close();
    writer.close();
  }
}