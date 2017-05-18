import java.io.PrintWriter;
import java.util.Scanner;

public class Staircase {

    static Scanner scanner = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception {
        int N = scanner.nextInt();
        int spaces = N;

        while (spaces-- > 0) {
            for (int i = 0; i < spaces; i++)
                pw.print(" ");
            for (int i = 0; i < N - spaces; i++)
                pw.print("#");
            pw.println();
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}