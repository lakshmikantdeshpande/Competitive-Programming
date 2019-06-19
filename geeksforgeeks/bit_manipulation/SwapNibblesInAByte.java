package geeksforgeeks.bit_manipulation;

import java.io.PrintWriter;
import java.util.Scanner;

class SwapNibblesInAByte {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int num = scanner.nextInt();
      int swapped = (num & 0xF0) >> 4 | (num & 0x0F) << 4;
      writer.println(swapped);
    }

    scanner.close();
    writer.close();
  }
}