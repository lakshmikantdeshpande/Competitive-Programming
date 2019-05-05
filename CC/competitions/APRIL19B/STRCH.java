package CC.competitions.APRIL19B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class STRCH {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int T = Integer.parseInt(bufferedReader.readLine());
    while (T-- > 0) {
      bufferedReader.readLine();
      String[] tokens = bufferedReader.readLine().split(" ");
      String string = tokens[0];
      char substring = tokens[1].charAt(0);

      writer.println(getSubstringCount(string, substring));
    }

    bufferedReader.close();
    writer.close();
  }

  private static long getSubstringCount(String input, char c) {
    long count = 0;
    long last = 0;
    long lastIndex = 0;
    long sum = 0;
    List<Long> list = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == c) {
        long temp = i + 1 - last;
        list.add(temp);
        sum += temp;
        last = i + 1;
        lastIndex = i;
      }
    }
    list.add(input.length() - lastIndex);
    sum += input.length() - lastIndex;
    for (long i : list) {
      sum -= i;
      count += sum * i;
    }
    return count;
  }
}
