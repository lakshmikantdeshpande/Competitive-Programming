import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Quicksort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strt = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(strt.nextToken());
        strt = new StringTokenizer(br.readLine());

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = parseInt(strt.nextToken());
        }

        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            if (array[i] < array[0]) {
                smaller.add(array[i]);
            } else {
                larger.add(array[i]);
            }
        }

        smaller.add(array[0]);
        smaller.addAll(larger);
        for (int i = 0; i < N; i++) {
            pw.print(smaller.get(i) + " ");
        }

        pw.close();
        br.close();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

}
