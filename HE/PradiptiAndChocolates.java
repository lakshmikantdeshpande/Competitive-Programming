import java.io.PrintWriter;
import java.util.Scanner;

public class PradiptiAndChocolates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            long last = 0;
            long curr = 0;
            long chocolates = 0;
            long answer = 0;

            long N = scanner.nextLong();
            long cost = scanner.nextLong();

            for (int i = 0; i < N; i++) {
                curr = scanner.nextLong();
                chocolates = chocolates + last - curr;
                if (chocolates < 0) {
                    answer += -chocolates;
                    chocolates = 0;
                }
                last = curr;
            }
            printWriter.println(answer * cost);
        }

        scanner.close();
        printWriter.close();
    }

}
