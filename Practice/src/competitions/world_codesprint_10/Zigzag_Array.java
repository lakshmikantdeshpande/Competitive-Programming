package competitions.world_codesprint_10;

import java.io.PrintWriter;
import java.util.Scanner;

public class Zigzag_Array {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        // to check if last element was in increasing order or decreasing
        int N = scanner.nextInt();
        int removals = 0;

        int lastA = scanner.nextInt(), lastB = 0;
        if (N > 2)
            lastB = scanner.nextInt();

        for (int i = 0; i < N - 2; i++) {
            int temp = scanner.nextInt();
            if (!((lastA < lastB && lastB > temp) || (lastA > lastB && lastB < temp)))
                removals++;
            lastA = lastB;
            lastB = temp;
        }

        pw.println(removals);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
