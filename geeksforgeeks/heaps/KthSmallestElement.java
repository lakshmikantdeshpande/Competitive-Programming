package geeksforgeeks.heaps;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = scanner.nextInt();
    while (testCases-- > 0) {
      int n = scanner.nextInt();
      int[] elements = new int[n];
      for (int i = 0; i < n; i++) {
        elements[i] = scanner.nextInt();
      }
      int k = scanner.nextInt();
      writer.println(kthSmallest(k, elements));
    }

    scanner.close();
    writer.close();
  }

  private static int kthSmallest(int k, int[] elements) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    Arrays.stream(elements).forEach(queue::offer);
    while (k-- > 1) {
      queue.poll();
    }
    if (queue.isEmpty()) {
      throw new IllegalStateException();
    }
    return queue.poll();
  }
}