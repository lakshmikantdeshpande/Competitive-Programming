package GFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class MoveAllZerosToEnd {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(reader.readLine());
    while (testCases-- > 0) {
      int n = Integer.parseInt(reader.readLine());
      int[] numbers = new int[n];
      String[] line = reader.readLine().split(" ");
      for (int i = 0; i < n; i++) {
        numbers[i] = Integer.parseInt(line[i]);
      }

      moveZerosToEnd(n, numbers);
      for (int i = 0; i < n; i++) {
        writer.print(numbers[i] + " ");
      }
      writer.println();
    }

    reader.close();
    writer.close();
  }

  private static void moveZerosToEnd(int n, int[] numbers) {
    int count = 0;

    for (int i = 0; i < n; i++) {
      if (numbers[i] != 0) {
        numbers[count++] = numbers[i];
      }
    }

    while (count < n) {
      numbers[count++] = 0;
    }
  }
}