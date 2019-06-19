package geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class KeyPair {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(reader.readLine());
    while (testCases-- > 0) {
      String[] nAndSum = reader.readLine().split(" ");
      int n = Integer.parseInt(nAndSum[0]);
      int sum = Integer.parseInt(nAndSum[1]);

      int[] numbers = new int[n];
      String[] nums = reader.readLine().split(" ");

      for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(nums[i]);
      writer.print(doesSumPairExistSort(sum, numbers));
      writer.print("   ");
      writer.println(doesSumPairExist(sum, numbers));
    }

    reader.close();
    writer.close();
  }

  // Sorting approach
  private static String doesSumPairExistSort(int sum, int[] numbers) {
    Arrays.sort(numbers);
    int i = 0, j = numbers.length - 1;
    while (i < j) {
      int actualSum = numbers[i] + numbers[j];
      if (actualSum == sum) {
        return "Yes";
      } else if (actualSum < sum) {
        i++;
      } else {
        j--;
      }
    }

    return "No";
  }

  // Set approach
  private static String doesSumPairExist(int sum, int[] numbers) {
    Set<Integer> sumSet = new HashSet<>();
    for (int number : numbers) {
      if (sumSet.contains(number)) {
        return "Yes";
      }
      sumSet.add(sum - number);
    }
    return "No";
  }
}