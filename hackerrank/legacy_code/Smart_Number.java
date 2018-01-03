// Perfect square has odd number of factors

import java.io.PrintWriter;
import java.util.Scanner;

public class Smart_Number {
    private static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        return (val * val == num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int num = in.nextInt();
            if (isSmartNumber(num)) {
                pw.println("YES");
            } else pw.println("NO");
        }

        in.close();
        pw.close();
    }
}