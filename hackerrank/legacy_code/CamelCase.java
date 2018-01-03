// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class CamelCase {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int counter = 1;
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90)
                counter++;
        }

        pw.println(counter);
        pw.close();
        scanner.close();
    }
}
