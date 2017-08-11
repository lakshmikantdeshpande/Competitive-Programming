// N time 1 N space
package AUG17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

class RAINBOWA {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = parseInt(br.readLine());
        while (T-- > 0) {
            int N = parseInt(br.readLine());
            String[] carray = br.readLine().split(" ");
            int[] array = new int[N];

            for (int i = 0; i < N; i++) {
                array[i] = parseInt(carray[i]);
            }

            int i = 0, j = N - 1;
            Set<Integer> set = new HashSet<>();
            boolean flag = true;

            while (i <= j) {
                set.add(array[i]);
                if (array[i] != array[j]) {
                    flag = false;
                    break;
                }
                i++;
                j--;
            }

            if (!flag) {
                pw.println("no");
            } else {
                for (int k : set) {
                    if (k < 1 || k > 7) {
                        flag = false;
                        break;
                    }
                }
                if (flag && set.size() == 7)
                    pw.println("yes");
                else
                    pw.println("no");
            }
        }

        pw.close();
        br.close();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

}
