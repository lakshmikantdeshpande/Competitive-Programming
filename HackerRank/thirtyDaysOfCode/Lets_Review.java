// Day 6
package thirtyDaysOfCode;

import java.io.PrintWriter;
import java.util.Scanner;

public class Lets_Review {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- > 0) {
            String line = scanner.next();
            StringBuilder strb1 = new StringBuilder();
            StringBuilder strb2 = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                if (i % 2 == 0)
                    strb1.append(line.charAt(i));
                else
                    strb2.append(line.charAt(i));
            }
            pw.println(strb1.append(" ").append(strb2));
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}