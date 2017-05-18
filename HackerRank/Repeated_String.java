import java.io.PrintWriter;
import java.util.Scanner;

public class Repeated_String {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String string = scanner.nextLine();
        final int len = string.length();
        final long N = scanner.nextLong();

        long mod = N % len;
        long t = 0, sum = 0;
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == 'a')
                sum++;
            if (i == mod - 1) {
                t = sum;
                if (mod == 0)
                    break;
            }
        }
        pw.println(sum * (N / len) + t);

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}