import java.io.PrintWriter;
import java.util.Scanner;

public class Super_Reduced_String {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] array = new int[26];

        for (char c : scanner.nextLine().toCharArray())
            ++array[c - 97];

        for (int i = 0; i < 26; i++) {
            if (array[i] % 2 != 0)
                pw.print((char) (i + 97));
        }

        pw.close();
        scanner.close();
    }
}
