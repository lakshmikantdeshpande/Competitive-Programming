package leetcode.goldman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HighFive {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int[] item : items) {
            PriorityQueue<Integer> queue = map.getOrDefault(item[0], new PriorityQueue<>());
            queue.offer(item[1]);
            if (queue.size() > 5) {
                queue.poll();
            }
            map.put(item[0], queue);
        }

        int[][] result = new int[map.size()][2];
        int c = 0;
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            PriorityQueue<Integer> queue = entry.getValue();
            int sum = 0;
            while (!queue.isEmpty()) {
                sum += queue.poll();
            }
            result[c++] = new int[]{entry.getKey(), sum / 5};
        }
        return result;
    }
}
