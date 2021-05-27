package leetcode.paypal;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new PointComparator());
        for (int[] point : points) {
            queue.offer(point);
        }
        int i = 0;
        int[][] result = new int[k][2];
        while (i < k) {
            result[i++] = queue.poll();
        }
        return result;
    }

    private static final class PointComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] one, int[] two) {
            double o = Math.sqrt(Math.pow((one[0]), 2) + Math.pow((one[1]), 2));
            double t = Math.sqrt(Math.pow((two[0]), 2) + Math.pow((two[1]), 2));
            return Double.compare(o, t);
        }
    }
}
