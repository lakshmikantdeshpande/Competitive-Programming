// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

public class Super_Reduced_String {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        for (int i = 1; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i - 1)) {
                stringBuilder.delete(i - 1, i + 1); // i + 1 is excluded
                i = 0;
            }
        }

        if (stringBuilder.length() == 0)
            pw.println("Empty String");
        else
            pw.println(stringBuilder.toString());
        pw.close();
        scanner.close();
    }
}
