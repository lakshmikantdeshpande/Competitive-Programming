// Day 9
package thirtyDaysOfCode;

import java.io.PrintWriter;
import java.util.Scanner;

public class Recursion {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        pw.println(factorial(N));
        
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}