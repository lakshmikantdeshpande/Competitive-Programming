import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Insertion_Sort_1 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = parseInt(stringTokenizer.nextToken());
        }

        int j = N - 1;
        int temp = array[j];
        while (j >= 1 && temp < array[j - 1]) {
            array[j] = array[j - 1];
            printArray(array, pw);
            j--;
        }

        array[j] = temp;
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
