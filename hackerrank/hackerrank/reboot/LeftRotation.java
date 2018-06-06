package hackerrank.hackerrank.reboot;

import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        final int N = scanner.nextInt();
        int rotations = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            pw.print(array[rotations++ % N] + " ");
        }

        pw.close();
        scanner.close();
    }

}
