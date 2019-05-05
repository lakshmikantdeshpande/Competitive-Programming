package Arrays;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class KLargestElements {
  public static void main(String[] args) {
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    Scanner scanner = new Scanner(System.in);
    PrintWriter printWriter = new PrintWriter(System.out);
    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int noOfLargestElements = scanner.nextInt();
      while (N-- > 0) {
        queue.offer(scanner.nextInt());
      }
      while (noOfLargestElements-- > 0) {
        printWriter.print(queue.poll() + " ");
      }
      queue.clear();
      printWriter.print("\n");
    }
    printWriter.close();
    scanner.close();
  }
}
