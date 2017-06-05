// n time n space

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;
import java.util.StringTokenizer;

class BROKPHON {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = parseInt(br.readLine());
        while (T-- > 0) {
            int N = parseInt(br.readLine());
            StringTokenizer strt = new StringTokenizer(br.readLine());
            long last = parseLong(strt.nextToken());
            BitSet bitSet = new BitSet(N);

            for (int i = 1; i < N; i++) {
                long temp = parseLong(strt.nextToken());
                if (last != temp) {
                    bitSet.set(i);
                    bitSet.set(i - 1);
                }
                last = temp;
            }
            // gives the number of set bits in the bitset
            pw.println(bitSet.cardinality());
        }

        pw.close();
        br.close();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

    private static long parseLong(String string) {
        return Long.parseLong(string);
    }
}