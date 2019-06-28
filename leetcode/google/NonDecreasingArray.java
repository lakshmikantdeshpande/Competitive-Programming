package leetcode.google;

public class NonDecreasingArray {
  private static boolean isNonDecreasing(int[] array) {
    if (array.length <= 1) return true;

    int prev = array[0];
    int count = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] < prev) {
        if (count++ > 0) return false;
        if (i - 2 >= 0 && array[i - 2] > array[i]) {
          continue;
        }
      }
      prev = array[i];
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("TRUE  " + isNonDecreasing(new int[]{4, 2, 3}));
    System.out.println("FALSE  " + isNonDecreasing(new int[]{7, 8, 9, 1, 2}));
    System.out.println("TRUE  " + isNonDecreasing(new int[]{-1, 4, 2, 3}));
  }
}
