// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

public class Almost_Sorted {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int array[] = new int[N];
        int counter = 0;
        int start = 0, end = 0;
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
            if (i > 0 && array[i - 1] > array[i]) {
                ++counter;
                if (start == 0) {
                    start = i;
                }
                end = i;
            }
        }

        if (counter == 1) {
            if (N > 2 && array[start - 1] < array[end + 1] && array[end] > array[start - 2 >= 0 ? start - 2 : 0]) {
                pw.println("yes\nswap " + start + " " + (end + 1));
            } else if (N == 2) {
                pw.println("yes\nswap " + start + " " + (end + 1));
            } else {
                pw.println("no");
            }
        } else if (counter == 2) {
            pw.println("yes\nswap " + start + " " + (end + 1));
        } else if (counter > 1) {
            if (array[start - 2] < array[end] && array[start - 1] < array[end + 1] && end - start == counter - 1) {
                pw.println("yes\nreverse " + start + " " + (end + 1));
            } else {
                pw.println("no");
            }
        } else if (counter == 0) {
            pw.println("yes");
        }
        pw.close();
        scanner.close();
    }
}