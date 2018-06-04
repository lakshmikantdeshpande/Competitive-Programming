package hackerrank.hackerrank.reboot;

import java.io.PrintWriter;
import java.util.Scanner;

public class Arrays_DS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[N - i - 1] = scanner.nextInt();
        }

        for (int i : array) {
            pw.print(i + " ");
        }

        pw.close();
        scanner.close();
    }

}
