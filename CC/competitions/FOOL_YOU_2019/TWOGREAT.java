import java.io.PrintWriter;
import java.util.Scanner;

class TWOGREAT {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      long number = scanner.nextLong();
      long shift = scanner.nextInt();
      writer.println(number >> shift);
    }

    scanner.close();
    writer.close();
  }
}
