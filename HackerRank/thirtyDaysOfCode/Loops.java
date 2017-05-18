// Day 5
package thirtyDaysOfCode;

import java.io.PrintWriter;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            pw.println(N + " x " + i + " = " + (N * i));
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}