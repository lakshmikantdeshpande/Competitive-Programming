package CC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class ICPC16B {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer str;

    int T = parseInt(br.readLine());
    while (T-- > 0) {
      int N = parseInt(br.readLine());
      str = new StringTokenizer(br.readLine());

      int minusones = 0, ones = 0, zeroes = 0, others = 0;
      for (int i = 0; i < N; i++) {
        int temp = parseInt(str.nextToken());

        if (temp == 0)
          zeroes++;
        else if (temp == 1)
          ones++;
        else if (temp == -1)
          minusones++;
        else
          others++;
      }

      if (others > 1)
        pw.println("no"); // it will go in an infinite loop, try then confirm
      else if (ones == 0 && minusones > 1)
        pw.println("no");  // minus * minus = plus is not present
      else if (others == 1 && minusones > 0)
        pw.println("no");  // other * minusone won't be present
      else
        pw.println("yes");
    }

    pw.close();
    br.close();
  }

  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }
}
