// Prefix sum array
// n + n time 1 space (time taken for input is considered)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class CHEFSUM {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = parseInt(br.readLine());
        while (T-- > 0) {
            int N = parseInt(br.readLine());
            int[] array = new int[N];

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int i = 0;
            long sum = 0;

            while (stringTokenizer.hasMoreTokens()) {
                array[i] = parseInt(stringTokenizer.nextToken());
                sum += array[i];
                ++i;
            }

            long min = Long.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < N; j++) {
                long temp = array[j] + sum;
                if (temp < min) {
                    minIndex = j;
                    min = temp;
                }
            }

            pw.println(++minIndex);  // 1 base index
        }
        pw.close();
        br.close();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

}
