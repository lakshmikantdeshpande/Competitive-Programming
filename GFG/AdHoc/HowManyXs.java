package GFG.AdHoc;

import java.io.PrintWriter;
import java.util.Scanner;

class HowManyXs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int digit = scanner.nextInt();
      int start = scanner.nextInt();
      int end = scanner.nextInt();

      int count = 0;
      for (int i = start + 1; i < end; i++) {
        count += checkDigitCount(i, digit);
      }
      writer.println(count);
    }

    scanner.close();
    writer.close();
  }

  private static int checkDigitCount(int number, int digit) {
    int count = 0;
    while (number > 0) {
      int temp = number % 10;
      if (temp == digit) {
        count++;
      }
      number /= 10;
    }
    return count;
  }
}
