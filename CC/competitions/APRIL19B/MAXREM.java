package CC.competitions.APRIL19B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class MAXREM {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);
    long first = Long.MIN_VALUE;
    long second = Long.MIN_VALUE;

    bufferedReader.readLine();
    long[] array = Arrays.stream(bufferedReader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    for (long number : array) {
      if (number > first) {
        second = first;
        first = number;
      } else if (number > second && number < first) {
        second = number;
      }
    }
    writer.println(second == Long.MIN_VALUE ? 0 : second);

    bufferedReader.close();
    writer.close();
  }
}