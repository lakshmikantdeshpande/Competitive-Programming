package CC;// linear time

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class MATPAN {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer stringTokenizer;

    int T = parseInt(br.readLine());
    while (T-- > 0) {
      stringTokenizer = new StringTokenizer(br.readLine());
      int[] values = new int[26];
      int v = 0;
      while (stringTokenizer.hasMoreTokens()) {
        values[v++] = parseInt(stringTokenizer.nextToken());
      }

      int[] frequency = new int[26];
      for (char c : br.readLine().toCharArray()) {
        int temp = c - 97;
        if (temp >= 0 && temp < 26) {
          ++frequency[temp];
        }
      }

      int sum = 0;
      for (int i = 0; i < 26; i++) {
        if (frequency[i] == 0) {
          sum += values[i];
        }
      }
      pw.println(sum);
    }

    pw.close();
    br.close();
  }

  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }

}
