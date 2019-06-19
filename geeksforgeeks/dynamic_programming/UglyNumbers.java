package geeksforgeeks.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class UglyNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(reader.readLine().trim());
    while (testCases-- > 0) {
      int n = Integer.parseInt(reader.readLine().trim());
      long uglyNumber = getNthUglyNumber(n);
      writer.println(uglyNumber);
    }

    reader.close();
    writer.close();
  }

  private static long getNthUglyNumber(int n) {
    long[] uglies = new long[n];

    // maintain next multiples of 2, 3, 5
    long nextTwo = 2;
    long nextThree = 3;
    long nextFive = 5;

    // maintain indices
    int two = 0;
    int three = 0;
    int five = 0;

    long nextUgly = uglies[0] = 1;

    for (int i = 1; i < n; i++) {
      // get minimum of nextTwo, nextThree, nextFive
      nextUgly = Math.min(nextTwo, Math.min(nextThree, nextFive));
      uglies[i] = nextUgly;

      if (nextUgly == nextTwo) {
        two++;
        nextTwo = uglies[two] * 2;
      }
      if (nextUgly == nextThree) {
        three++;
        nextThree = uglies[three] * 3;
      }
      if (nextUgly == nextFive) {
        five++;
        nextFive = uglies[five] * 5;
      }
    }
    return nextUgly;
  }
}