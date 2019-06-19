package geeksforgeeks.arrays;

import java.io.PrintWriter;
import java.util.Scanner;

class RotateArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int D = scanner.nextInt();

      int[] array = new int[N];
      for (int i = 0; i < N; i++) {
        array[i] = scanner.nextInt();
      }


      for (int i = D % N, count = 0; count < N; count++) {
        writer.print(array[i] + " ");
        i = (i + 1) % N;
      }
      writer.println();
    }

    scanner.close();
    writer.close();
  }
}