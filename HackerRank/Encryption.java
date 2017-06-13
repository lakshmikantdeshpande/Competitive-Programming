// N + N time N space (theoretically)

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

class Encryption {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer strt = new StringTokenizer(scanner.nextLine());
        StringBuilder string = new StringBuilder();
        while (strt.hasMoreTokens()) {
            string.append(strt.nextToken());
        }

        int row = (int) Math.floor(Math.sqrt(string.length()));
        int col = (int) Math.ceil(Math.sqrt(string.length()));

        // if box is smaller, increase rowcount
        if (row * col < string.length())
            ++row;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int temp = i + j * col;
                // if that square in the box is full print it, else skip it
                pw.print(temp < string.length() ? string.charAt(i + j * col) : "");
            }
            pw.print(" ");
        }
        pw.close();
        scanner.close();
    }
}