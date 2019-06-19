package geeksforgeeks.adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PowerOfTwo {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(reader.readLine());
    while (testCases-- > 0) {
      long number = Long.parseLong(reader.readLine());
      writer.println(isPowerOfTwo(number));
    }

    reader.close();
    writer.close();
  }

  private static String isPowerOfTwo(long number) {
    if (number != 0 && (number & (number - 1)) == 0)
      return "YES";
    return "NO";
  }
}
