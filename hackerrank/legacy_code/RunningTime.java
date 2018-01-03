import java.io.PrintWriter;
import java.util.Scanner;

public class RunningTime {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int swaps = 0;
        for (int j = 1; j < N; j++) {
            int temp = array[j];
            for (int k = j; k >= 0; k--) {
                if (k == 0 || temp >= array[k - 1]) {
                    array[k] = temp;
                    break;
                } else {
                    array[k] = array[k - 1];
                    ++swaps;
                }
            }
        }
        pw.println(swaps);
        pw.close();
        scanner.close();
    }
}
