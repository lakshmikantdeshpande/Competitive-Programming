package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class NITIKA {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int T = parseInt(br.readLine());
    while (T-- > 0) {
      String[] tokens = br.readLine().split(" ");
      if (tokens.length == 1) {
        sentenceCase(tokens[0], pw);
        pw.println();
      } else if (tokens.length == 2) {
        initials(tokens[0], pw);
        sentenceCase(tokens[1], pw);
        pw.println();
      } else {
        initials(tokens[0], pw);
        initials(tokens[1], pw);
        sentenceCase(tokens[2], pw);
        pw.println();
      }
    }

    pw.close();
    br.close();
  }

  private static void initials(String token, PrintWriter pw) {
    pw.print((token.charAt(0) + "").toUpperCase() + ". ");
  }

  private static void sentenceCase(String token, PrintWriter pw) {
    char[] chars = token.toLowerCase().toCharArray();
    String a = (chars[0] + "").toUpperCase();
    pw.print(a);
    for (int i = 1; i < chars.length; i++) {
      pw.print(chars[i]);
    }
    pw.print(" ");
  }

  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }
}
