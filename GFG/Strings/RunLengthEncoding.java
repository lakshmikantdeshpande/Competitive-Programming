package GFG.Strings;

import java.io.PrintWriter;
import java.util.Scanner;

public class RunLengthEncoding {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    scanner.nextLine();
    while (T-- > 0) {
      String string = scanner.nextLine();
      writer.println(compress(string));
    }

    scanner.close();
    writer.close();
  }

  private static String compress(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      int count = 1;
      while (i < string.length() - 1 &&
          string.charAt(i) == string.charAt(i + 1)) {
        count++;
        i++;
      }
      stringBuilder.append(string.charAt(i)).append(count);
    }
    return stringBuilder.toString();
  }
}
