import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Absolute_Difference_in_an_Array {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        long[] array = new long[N];
        long minimum = Long.MAX_VALUE;
        for (int i = 0; i < N; i++)
            array[i] = scanner.nextLong();

        Arrays.sort(array);
        for (int i = 0; i < N - 1; i++) {
            long temp = array[i + 1] - array[i];
            minimum = Math.min(temp, minimum);
        }

        pw.println(minimum);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}