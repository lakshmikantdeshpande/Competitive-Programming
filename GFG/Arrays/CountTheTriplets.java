package GFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class CountTheTriplets {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(reader.readLine());
    while (testCases-- > 0) {
      int n = Integer.parseInt(reader.readLine());
      int[] array = new int[n];
      String[] tokens = reader.readLine().split(" ");

      for (int i = 0; i < n; i++) {
        array[i] = Integer.parseInt(tokens[i]);
      }

      writer.println(getSumTripletCount(array));
    }

    reader.close();
    writer.close();
  }

  private static int getSumTripletCount(int[] array) {
    Arrays.sort(array);
    int count = 0;

    for (int i = array.length - 1; i >= 2; i--) {
      int j = 0;
      int k = i - 1;

      while (j < k) {
        int sum = array[j] + array[k];
        if (sum == array[i]) {
          count++;
          j++;
        } else if (sum < array[i]) {
          j++;
        } else {
          k--;
        }
      }
    }
    return count == 0 ? -1 : count;
  }
}
