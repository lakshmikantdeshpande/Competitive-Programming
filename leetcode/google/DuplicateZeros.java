package leetcode.google;

class Solution {
  public void duplicateZeros(int[] arr) {
    final int n = arr.length;

    // count zeros
    int count = 0;
    for (int i = 0; i < n; i++) if (arr[i] == 0) count++;

    // len is count of zeros + array length
    int len = n + count;

    // i starts and array length, j starts at array + offset length
    for (int i = n - 1, j = len - 1; i >= 0 && j >= 0; i--, j--) {
      if (arr[i] != 0) {
        if (j < n) arr[j] = arr[i];
      } else {
        if (j < n) arr[j] = arr[i];
        j--;
        if (j < n) arr[j] = arr[i];
      }
    }
  }
}