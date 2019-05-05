package CC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LECANDY {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      long candies = Integer.parseInt(br.readLine().split(" ")[1]);
      long sum = 0;
      for (String num : br.readLine().split(" ")) {
        sum += Integer.parseInt(num);
      }
      pw.println(sum > candies ? "No" : "Yes");
    }
    br.close();
    pw.close();
  }
}