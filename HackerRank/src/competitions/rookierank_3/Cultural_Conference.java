package competitions.rookie_rank_3;

import java.io.PrintWriter;
import java.util.*;

public class Cultural_Conference {
    private static int min = Integer.MAX_VALUE;

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int burnCount = 0;
        int[] emp = new int[N];

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 1; i < N; i++)
            map.put(i, new ArrayList<>());

        for (int i = 1; i < N; i++) {
            int employee = scanner.nextInt();
            int burnedOrNot = scanner.nextInt();
            burnCount = burnedOrNot == 0 ? burnCount + 1 : burnCount;
            emp[i] = burnedOrNot;
            // CEO doesn't get burned out
            if (employee != 0) {
                map.get(employee).add(i);
                map.get(i).add(employee);
            }
        }

        for (int i = 1; i < N; i++) {
            Set<Integer> set = new HashSet<>();
            for (int vertex : map.get(i)) {
                if (emp[vertex] == 0)
                    set.add(vertex);
            }

            Set<Integer> neighbour = new HashSet<>();
            neighbour.add(i);
            if (emp[i] == 0)
                set.add(i);

            doDFS(set, burnCount - set.size(), map, neighbour, 1, N, emp, burnCount);
        }

        pw.println(min);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    private static void doDFS(Set<Integer> set, int employees, Map<Integer, ArrayList<Integer>> map, Set<Integer> neighbour, int ecount, int N, int[] emp, int burnCount) {
        if (employees == 0) {
            min = Math.min(min, ecount);
            return;
        }
        if (ecount > min)
            return;

        for (int i = 1; i < N; i++) {
            if (!neighbour.contains(i)) {
                HashSet<Integer> current = new HashSet<>();
                for (int vertex : map.get(i))
                    if (emp[i] == 0)
                        current.add(vertex);
                if (emp[i] == 0)
                    current.add(i);
                current.addAll(set);
                if (current.size() > set.size()) {
                    Set<Integer> tempSet = new HashSet<>();
                    tempSet.add(i);
                    tempSet.addAll(neighbour);
                    doDFS(current, burnCount - current.size(), map, tempSet, ecount + 1, N, emp, burnCount);
                }
            }

        }
    }
}