package GFG.AdHoc;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwiceCounter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int words = scanner.nextInt();
      scanner.nextLine();

      Map<String, Integer> frequencyMap = new HashMap<>(words);
      while (words-- > 0) {
        String word = scanner.next();
        frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
      }

      int count = 0;
      for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() == 2) {
          count++;
        }
      }
      writer.println(count);
    }

    scanner.close();
    writer.close();
  }
}