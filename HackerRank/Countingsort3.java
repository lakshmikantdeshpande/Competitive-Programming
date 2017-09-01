import java.io.PrintWriter;
import java.util.Scanner;

public class Countingsort3 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int[] array = new int[100];

        for (int i = 0; i < N; i++) {
            ++array[scanner.nextInt()];
            scanner.nextLine();
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += array[i];
            pw.print(sum + " ");
        }
        pw.close();
        scanner.close();
    }
}
