package geeksforgeeks.arrays;

import java.io.PrintWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


class MaximumOfSubarraysOfSizeK {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int window = scanner.nextInt();

      int[] array = new int[N];
      for (int i = 0; i < N; i++) {
        array[i] = scanner.nextInt();
      }

      Deque<Integer> deq = new LinkedList<>();
      int i;
      for (i = 0; i < window; i++) {
        while (!deq.isEmpty() && array[i] >= array[deq.peekLast()]) {
          deq.removeLast();
        }
        deq.addLast(i);
      }

      for (; i < N; ++i) {
        writer.print(array[deq.peek()] + " ");

        while ((!deq.isEmpty()) && deq.peek() <= i - window)
          deq.removeFirst();

        while ((!deq.isEmpty()) && array[i] >= array[deq.peekLast()])
          deq.removeLast();

        deq.addLast(i);
      }

      writer.println(array[deq.peek()]);
    }

    scanner.close();
    writer.close();
  }
}