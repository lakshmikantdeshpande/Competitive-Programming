import java.io.PrintWriter;
import java.util.Scanner;

public class Manasa_and_Stones {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int i = N - 1, j = 0;
            while (i >= 0) {
                pw.print(i * A + j * B + " ");
                i--;
                j++;
            }
            pw.println();
        }

        pw.close();
        scanner.close();
    }
}