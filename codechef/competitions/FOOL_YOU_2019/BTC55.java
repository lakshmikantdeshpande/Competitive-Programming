package codechef.competitions.FOOL_YOU_2019;

import java.io.PrintWriter;
import java.util.Scanner;

class BTC55 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    scanner.nextLine();
    while (T-- > 0) {
      String sequence = scanner.nextLine();
      long count = 0;
      boolean regular = true;
      for (char c : sequence.toCharArray()) {
        if (c == '/') {
          count++;
        } else {
          count--;
        }
        if (count < 0) {
          regular = false;
          break;
        }
      }
      writer.println((regular ? "R" : "Irr") + "egular since Childhood.");
    }


    scanner.close();
    writer.close();
  }
}
