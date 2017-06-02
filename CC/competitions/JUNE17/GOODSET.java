package competitions.JUNE17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class GOODSET {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = parseInt(br.readLine());

        int[] array = new int[100];
        int t = 1;
        for (int i = 0; i < 100; i++) {
            array[i] = t;
            t += 2;
        }

        while (T-- > 0) {
            int N = parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                pw.print(array[i] + " ");
            }
            pw.println();
        }

        pw.close();
        br.close();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}