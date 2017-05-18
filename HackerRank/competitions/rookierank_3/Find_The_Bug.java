package competitions.rookierank_3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Find_The_Bug {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int temp = 0;

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            if ((temp = str.indexOf('X')) == -1)
                continue;
            else
                pw.print(i - 1 + "," + temp);
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
