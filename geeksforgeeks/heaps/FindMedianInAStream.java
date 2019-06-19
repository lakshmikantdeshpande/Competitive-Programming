package geeksforgeeks.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;

class FindMedianInAStream {
  private static final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  private static final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int n = Integer.parseInt(reader.readLine());
    while (n-- > 0) {
      int k = Integer.parseInt(reader.readLine().trim());
      add(k);
      writer.println(findMedian());
    }

    reader.close();
    writer.close();
  }

  private static void add(int n) {
    minHeap.offer(n);
    maxHeap.offer(minHeap.poll());

    if (minHeap.size() < maxHeap.size()) {
      minHeap.offer(maxHeap.poll());
    }
  }

  private static int findMedian() {
    if (minHeap.size() > maxHeap.size()) {
      return minHeap.peek();
    } else {
      return (minHeap.peek() + maxHeap.peek()) / 2;
    }
  }
}
