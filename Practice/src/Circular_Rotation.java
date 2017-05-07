import java.io.PrintWriter;
import java.util.Scanner;

public class Circular_Rotation {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception {
        int N = scanner.nextInt(); // number of elements
        int K = scanner.nextInt(); // number of rotations
        int Q = scanner.nextInt(); // number of queries

        int[] array = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = scanner.nextInt();

        int p = K % N;
        for (int i = 0; i < Q; i++)
            out.println(array[(N - p + scanner.nextInt()) % N]);

        array = null;
        out.close();
        out = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}