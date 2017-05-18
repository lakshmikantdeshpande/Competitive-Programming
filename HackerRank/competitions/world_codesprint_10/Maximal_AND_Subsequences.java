package competitions.world_codesprint_10;

import java.io.PrintWriter;
import java.util.*;

public class Maximal_AND_Subsequences {

    private static PriorityQueue<Long> priorityQueue;

    public static void main(String args[]) throws Exception {
        priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int size = scanner.nextInt();
        List<Long> list = new ArrayList<>();

        while (N-- > 0)
            list.add(scanner.nextLong());
        permute(list, size);

        long max = priorityQueue.poll();
        long count = 1;
        while (!priorityQueue.isEmpty() && max == priorityQueue.poll())
            count++;

        pw.println(max);
        long temp = (long) (count % (Math.pow(10, 9) + 7));
        temp = size % 2 == 0 ? temp / size : (temp / size) - 1;
        pw.println(temp);
        priorityQueue = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    private static void permute(List<Long> list, int subsetSize) {
        List<Long> prefix = new ArrayList<Long>();
        permute(prefix, list, subsetSize);
    }

    private static void permute(List<Long> prefixList, List<Long> list, int subsetSize) {
        if (prefixList.size() == subsetSize) {
            heapItUp(prefixList);
        } else {
            for (int i = 0; i < list.size(); i++) {
                long removed = list.remove(i);
                if (!prefixList.isEmpty())
                    prefixList.add(removed);
                permute(prefixList, list, subsetSize);
                prefixList.remove(removed);
                list.add(i, removed);
            }
        }
    }

    private static void heapItUp(List<Long> list) {
        long temp = list.get(0);
        for (int i = 0; i < list.size(); i++)
            temp = temp & list.get(i);
        priorityQueue.add(temp);
    }

}
