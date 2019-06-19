package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class CHEFAPAR {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int T = parseInt(br.readLine());
    while (T-- > 0) {
      int N = parseInt(br.readLine());
      StringTokenizer str = new StringTokenizer(br.readLine());

      int fine = 0;
      boolean flag = false; // check for input 011 to understand why flag is used

      while (str.hasMoreTokens()) {
        int temp = parseInt(str.nextToken());
        if (temp == 0) {
          fine += 1100;
          flag = true;
        } else if (flag) {
          fine += 100;
        }
      }
      pw.println(fine);
    }

    pw.close();
    br.close();
  }

  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }
}
