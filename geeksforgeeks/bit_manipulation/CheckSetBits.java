package geeksforgeeks.bit_manipulation;

import java.io.PrintWriter;
import java.util.Scanner;

class CheckSetBits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int number = scanner.nextInt();
      boolean allSet = areAllBitsSet(number);
      writer.println(allSet ? "YES" : "NO");
    }

    scanner.close();
    writer.close();
  }

  private static boolean areAllBitsSet(int number) {
    while (number > 0) {
      if ((number & 1) == 0) {
        return false;
      }
      number >>= 1;
    }
    return true;
  }
}