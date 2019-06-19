package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class SNELECT {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int T = parseInt(br.readLine());
    while (T-- > 0) {
      StringBuilder str = new StringBuilder(br.readLine());

      for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == 's' && str.charAt(i + 1) == 'm') {
          str.deleteCharAt(i);
        } else if (str.charAt(i) == 'm' && str.charAt(i + 1) == 's') {
          str.deleteCharAt(i + 1);
        }
      }

      int snakes = 0, mongooses = 0;
      for (char c : str.toString().toCharArray()) {
        if (c == 'm')
          ++mongooses;
        else if (c == 's')
          ++snakes;
      }
      pw.println(snakes == mongooses ? "tie" : snakes > mongooses ? "snakes" : "mongooses");
    }

    pw.close();
    br.close();
  }

  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }
}
