package codechef.competitions.LTIME70B;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TSTROBOT {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int K = scanner.nextInt();

      scanner.nextLine();
      String moves = scanner.nextLine();
      Set<Integer> positions = new HashSet<>();
      positions.add(K);
      for (char c : moves.toCharArray()) {
        switch (c) {
          case 'L':
            positions.add(--K);
            break;
          case 'R':
            positions.add(++K);
            break;
        }
      }
      writer.println(positions.size());

    }

    scanner.close();
    writer.close();
  }
}