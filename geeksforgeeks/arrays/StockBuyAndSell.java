import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Interval {
  int buy;
  int sell;

  @Override
  public String toString() {
    return ("(" + buy + " " + sell + ")");
  }
}

class Solution {
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

      List<Interval> intervals = new ArrayList<>();
      int i = 0;
      while (i < N - 1) {
        while (i < N - 1 && array[i] >= array[i + 1]) {
          i++;
        }

        if (i == N - 1) {
          break;
        }

        Interval interval = new Interval();
        interval.buy = i++;

        while (i < N && array[i] >= array[i - 1]) {
          i++;
        }
        interval.sell = i - 1;
        intervals.add(interval);
      }

      if (intervals.isEmpty()) {
        writer.println("No Profit");
      } else {
        for (Interval interval : intervals) {
          writer.print(interval + " ");
        }
        writer.println();
      }
    }

    scanner.close();
    writer.close();
  }
}