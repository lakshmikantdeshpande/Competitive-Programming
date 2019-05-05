package CC.competitions.JUNE17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class XENRANK {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int T = parseInt(br.readLine());
    while (T-- > 0) {
      StringTokenizer strt = new StringTokenizer(br.readLine());
      int x = parseInt(strt.nextToken());
      int y = parseInt(strt.nextToken());
      pw.println(result(x, y));
    }

    pw.close();
    br.close();
  }


  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }

  private static String result(int x, int y) {
    long temp = x + y;
    return (((temp + 1) * (temp + 2)) / 2) - temp + (temp - y) + "";
  }

}