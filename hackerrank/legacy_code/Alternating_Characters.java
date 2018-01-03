// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

public class Alternating_Characters {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            pw.println(solve(scanner.nextLine()));
        }

        pw.close();
        scanner.close();
    }

    private static int solve(String s) {
        int counter = 0;
        if (s.length() < 2)
            return 1;
        char last = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == last)
                counter++;
            else
                last = s.charAt(i);
        }
        return counter;
    }
}
