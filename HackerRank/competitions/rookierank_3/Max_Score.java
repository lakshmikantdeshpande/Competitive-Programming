package competitions.rookierank_3;

import java.io.PrintWriter;
import java.util.*;

public class Max_Score {
    private static long answer = Integer.MIN_VALUE;

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
            list.add(scanner.nextLong());

        for (int i = 0; i < N; i++) {
            Set<Long> set = new HashSet<>();
            set.addAll(list);
            set.remove(list.get(i));
            findMaxMod(set, 0, list.get(i));
        }

        pw.println(answer);

        list = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    private static void findMaxMod(Set<Long> set, long score, long runningScore) {
        if (set.isEmpty()) {
            answer = Math.max(answer, score);
            return;
        }
        for (Long number : set) {
            HashSet<Long> current = new HashSet<>();
            long temp = score + runningScore % number;
            current.addAll(set);
            current.remove(number);
            findMaxMod(current, temp, runningScore + number);
        }
    }
}