import java.io.PrintWriter;
import java.util.Scanner;

public class Service_Lane {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = scanner.nextInt();

        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = Integer.MAX_VALUE;

            for (int i = a; i <= b; i++)
                min = Math.min(array[i], min);

            pw.println(min);
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
