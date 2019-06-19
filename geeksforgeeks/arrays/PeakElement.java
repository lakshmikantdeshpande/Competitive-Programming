package geeksforgeeks.arrays;

import java.util.Scanner;

class PeakElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      int A = new Peak().peakElement(a, n);
      int f = 0;
      if (n == 1)
        f = 1;
      else if (A == 0 && a[0] >= a[1])
        f = 1;
      else if (A == n - 1 && a[n - 1] >= a[n - 2])
        f = 1;
      else if (a[A] >= a[A + 1] && a[A] >= a[A - 1])
        f = 1;
      else
        f = 0;
      System.out.println(f);
    }
  }

  private static class Peak {
    int peakElement(int[] array, int n) {
      if (n == 1) {
        return 0;
      }
      for (int i = 0; i < n; i++) {
        if (i == 0) {
          if (array[i] >= array[i + 1]) {
            return i;
          }
        } else if (i == n - 1) {
          if (array[i] >= array[i - 1]) {
            return i;
          }
        } else if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
          return i;
        }
      }
      return -1;
    }
  }
}
