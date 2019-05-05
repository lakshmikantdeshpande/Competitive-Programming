package CC;// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class TEAMFORM {
  public static void main(String args[]) throws Exception {
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int M = scanner.nextInt();

      for (int i = 0; i < M; i++) {
        scanner.nextInt();
        scanner.nextInt();
      }
      pw.println((N - 2 * M) % 2 == 0 ? "yes" : "no");
    }

    pw.close();
    scanner.close();
  }
}