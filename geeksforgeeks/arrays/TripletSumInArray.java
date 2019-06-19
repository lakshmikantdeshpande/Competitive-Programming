package geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class TripletSumInArray {
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
      writer.println(doesTripletSumExistSort(sum, numbers));
    }

    reader.close();
    writer.close();
  }

  // sort and iterate
  private static int doesTripletSumExistSort(int sum, int[] numbers) {
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length - 2; i++) {
      int low = i + 1;
      int high = numbers.length - 1;
      while (low < high) {
        int actualSum = numbers[i] + numbers[low] + numbers[high];
        if (actualSum == sum) {
          return 1;
        } else if (actualSum < sum) {
          low++;
        } else {
          high--;
        }
      }
    }
    return 0;
  }
}