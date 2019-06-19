package codechef.competitions.FOOL_YOU_2019;

import java.io.PrintWriter;
import java.util.Scanner;

class PRF8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    long number = scanner.nextLong();
    if (number == 6 || number == 28 || number == 496 || number == 8128 || number == 33550336 || number == 8589869056L || number == 137438691328L) {
      writer.println("Perfect");
    } else {
      writer.println("Not Perfect");
    }

    scanner.close();
    writer.close();
  }
}
