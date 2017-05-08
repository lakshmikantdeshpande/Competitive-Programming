package competitions.rookie_rank_3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Maximal_Tourism {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        UF wqupc = new UF(N + 2);
        while (M-- > 0)
            wqupc.join(scanner.nextInt(), scanner.nextInt());

        pw.println(java.util.Arrays.stream(wqupc.getSize()).max().getAsInt());
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}

class UF {
    private int[] size;
    private int[] id;

    UF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 1; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public int[] getSize() {
        return size;
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    void join(int p, int q) {
        int pid = root(p);
        int qid = root(q);

        if (pid == qid)
            return;
        else {
            // make larger tree parent of smaller tree
            if (size[pid] >= size[qid]) {
                size[pid] += size[qid];
                id[qid] = pid;
            } else {
                size[qid] += size[pid];
                id[pid] = qid;
            }
        }
    }

}
