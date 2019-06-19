package geeksforgeeks.arrays;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class FrequencyGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      System.out.println(largeNumberWithMinimumFrequency(arr));
    }
  }

  private static int largeNumberWithMinimumFrequency(int[] arr) {
    Map<Integer, Integer> freqMap = new TreeMap<>(Collections.reverseOrder());
    for (int number : arr) freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
    int biggestNum = Integer.MIN_VALUE;
    int smallestFreq = Integer.MAX_VALUE;

    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();

      if (biggestNum < key && smallestFreq >= value) {
        biggestNum = key;
        smallestFreq = value;
      }
    }
    return biggestNum;
  }
}

