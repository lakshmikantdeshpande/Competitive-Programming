package CC;

import java.io.PrintWriter;
import java.util.Scanner;

class FSQRT {
  public static void main(String args[]) throws Exception {
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int N = scanner.nextInt();
    while (N-- > 0) {
      int temp = scanner.nextInt();
      pw.println(Math.round(Math.sqrt(temp)));
    }

    pw.close();
    scanner.close();
  }
}
