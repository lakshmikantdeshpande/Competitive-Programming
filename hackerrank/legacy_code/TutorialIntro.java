import java.io.PrintWriter;
import java.util.Scanner;

public class TutorialIntro {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp == n) {
                pw.print(i);
            }
        }

        pw.close();
        scanner.close();
    }
}
