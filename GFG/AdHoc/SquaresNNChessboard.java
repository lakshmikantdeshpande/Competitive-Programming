import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      long squares = (((N * (N + 1)) / 2) * (2 * N + 1)) / 3;
      writer.println(squares);
    }

    scanner.close();
    writer.close();
  }
}