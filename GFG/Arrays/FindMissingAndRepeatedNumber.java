// Find missing and repeating number
// N time N space(Input)

import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);


    int T = scanner.nextInt();
    while (T-- > 0) {
      // INPUT
      int N = scanner.nextInt();
      int[] freq = new int[N + 1];
      for (int i = 0; i < N; i++) {
        int num = scanner.nextInt();
        freq[num] = freq[num] == 0 ? 1 : -1;
      }

      // LOGIC
      int missingNumber = 0, repeatedNumber = 0;
      for (int i = 1; i <= N; i++) {
        int temp = freq[i];
        if (temp == 0) {
          missingNumber = i;
        } else if (temp == -1) {
          repeatedNumber = i;
        }
        if (missingNumber != 0 && repeatedNumber != 0) {
          break;
        }
      }
      writer.println(repeatedNumber + " " + missingNumber);
    }


    scanner.close();
    writer.close();
  }
}