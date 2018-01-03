// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        int rotation = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            pw.print((char) caesar(string.charAt(i), rotation));
        }

        pw.close();
        scanner.close();
    }

    private static int caesar(char c, int rotation) {
        if (c >= 'a' && c <= 'z')
            return (((c - 'a' + rotation) % 26) + 'a');
        else if (c >= 'A' && c <= 'Z')
            return (((c - 'A' + rotation) % 26) + 'A');
        else
            return c;
    }
}
