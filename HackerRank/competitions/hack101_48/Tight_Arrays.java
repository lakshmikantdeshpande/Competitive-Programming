package competitions.hack101_48;

import java.io.PrintWriter;
import java.util.Scanner;

class Tight_Arrays {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && b <= c)
            pw.println(c - a + 1);
        else if (a >= b && b >= c)
            pw.println(a - c + 1);
        else
            pw.println(Math.abs(a - b) + Math.abs(c - b) + 1);

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}