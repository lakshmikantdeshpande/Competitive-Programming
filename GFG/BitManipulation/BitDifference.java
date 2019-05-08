package GFG.BitManipulation;

import java.io.PrintWriter;
import java.util.Scanner;

class BitDifference {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      String first = Integer.toBinaryString(scanner.nextInt());
      String second = Integer.toBinaryString(scanner.nextInt());
      if (first.length() < second.length()) {
        first = padString(first, second.length() - first.length());
      } else if (first.length() > second.length()) {
        second = padString(second, first.length() - second.length());
      }
      int count = 0;
      for (int i = 0; i < first.length(); i++) {
        if ((Character.getNumericValue(first.charAt(i)) ^
            Character.getNumericValue(second.charAt(i))) == 1) {
          count++;
        }
      }
      writer.println(count);
    }

    scanner.close();
    writer.close();
  }

  private static String padString(String input, int length) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < length; i++) {
      builder.append(0);
    }
    return builder.append(input).toString();
  }
}