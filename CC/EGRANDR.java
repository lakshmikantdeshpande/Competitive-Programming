package CC;

import java.io.PrintWriter;
import java.util.Scanner;

class EGRANDR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            boolean hasFailed = false;
            boolean hasFullMarks = false;

            float sum = 0;
            int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                int temp = scanner.nextInt();
                sum += temp;
                if (temp <= 2) {
                    hasFailed = true;
                } else if (temp == 5) {
                    hasFullMarks = true;
                }
            }
            sum /= N;
            if (hasFailed || !hasFullMarks || sum < 4.0f) {
                pw.println("No");
            } else {
                pw.println("Yes");
            }
        }

        pw.close();
        scanner.close();
    }
}