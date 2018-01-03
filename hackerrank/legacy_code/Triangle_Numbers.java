import java.io.PrintWriter;
import java.util.Scanner;

public class Triangle_Numbers {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        while (N-- > 0) {
            solve(scanner.nextInt(), pw);
        }

        pw.close();
        scanner.close();
    }

    private static void solve(int i, PrintWriter pw) {
        if (i < 3)
            pw.println(-1);
        else {
            if (i % 2 != 0)
                pw.println(2);
            else if (i % 4 == 0)
                pw.println(3);
            else
                pw.println(4);
        }
    }
}
