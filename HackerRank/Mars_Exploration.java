// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Mars_Exploration {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String string = scanner.nextLine();
        final int len = string.length() - 2;
        int count = 0;

        for (int i = 0; i < len; i += 3) {
            count += string.charAt(i) == 'S' ? 0 : 1;
            count += string.charAt(i + 1) == 'O' ? 0 : 1;
            count += string.charAt(i + 2) == 'S' ? 0 : 1;
        }

        pw.println(count);
        pw.close();
        scanner.close();
    }
}
