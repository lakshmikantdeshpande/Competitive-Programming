import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CorrectnessInvariant {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = parseInt(stringTokenizer.nextToken());
        }

        for (int j = 1; j < N; j++) {
            int temp = array[j];
            for (int k = j; k >= 0; k--) {
                if (k == 0 || temp >= array[k - 1]) {
                    array[k] = temp;
                    break;
                } else {
                    array[k] = array[k - 1];
                }
            }
        }
        printArray(array, pw);

        pw.close();
        br.close();
    }

    private static void printArray(int[] array, PrintWriter pw) {
        for (int i : array) {
            pw.print(i + " ");
        }
        pw.println();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
