package codechef;//  N time 1 space

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CHEFROUT {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int N = Integer.parseInt(br.readLine());
    while (N-- > 0) {
      boolean flag = false;
      String string = br.readLine();

      for (int i = 1; i < string.length(); i++) {
        if (string.charAt(i) < string.charAt(i - 1)) {
          flag = true;
          break;
        }
      }

      if (flag)
        pw.println("no");
      else
        pw.println("yes");
    }

    pw.close();
    br.close();
  }
}