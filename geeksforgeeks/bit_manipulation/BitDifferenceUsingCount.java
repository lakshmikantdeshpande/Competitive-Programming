package geeksforgeeks.bit_manipulation;

import java.io.PrintWriter;
import java.util.Scanner;

class BitDifferenceUsingCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int first = scanner.nextInt();
      int second = scanner.nextInt();
      writer.println(countSetBits(first ^ second));
    }

    scanner.close();
    writer.close();
  }

  private static int countSetBits(int number) {
    int count = 0;
    while (number > 0) {
      number &= number - 1;
      count++;
    }
    return count;
  }
}
