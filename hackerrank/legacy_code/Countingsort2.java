import java.io.PrintWriter;
import java.util.Scanner;

public class Countingsort2 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int[] array = new int[100];

        for (int i = 0; i < N; i++) {
            ++array[scanner.nextInt()];
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < array[i]; j++) {
                pw.print(i + " ");
            }
        }
        pw.close();
        scanner.close();
    }
}
