import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      // INPUT
      int N = scanner.nextInt();
      int[] array = new int[N];
      for (int i = 0; i < N; i++) {
        array[i] = scanner.nextInt();
      }

      // LOGIC
      int low = 0, mid = 0, high = N - 1;
      while (mid <= high) {
        switch (array[mid]) {
          case 0:
            swap(array, low, mid);
            low++;
            mid++;
            break;
          case 1:
            mid++;
            break;
          case 2:
            swap(array, mid, high);
            high--;
            break;
        }
      }
      for (int i = 0; i < N; i++) {
        writer.print(array[i] + " ");
      }
      writer.print("\n");
    }

    scanner.close();
    writer.close();
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}