package geeksforgeeks.arrays;

class PeakElementInMountainArray {
  public int peakIndexInMountainArray(int[] A) {
    int i = 0;
    while (i < A.length - 2) {
      if (A[i] < A[i + 1] && A[i + 1] > A[i + 2]) {
        return i + 1;
      }
      i++;
    }
    return -1;
  }
}