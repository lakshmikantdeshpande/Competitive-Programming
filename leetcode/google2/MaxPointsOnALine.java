package leetcode.google2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        int globalMax = 0;

        for (int i = 0; i < points.length; i++) {
            int localMax = 0;
            int samePoint = 1;
            Map<List<Integer>, Integer> slopeMap = new HashMap<>();

            for (int j = i + 1; j < points.length; j++) {
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];

                if (dx == 0 && dy == 0) {
                    samePoint++;
                } else {
                    List<Integer> slope = getSlope(dy, dx);
                    slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                    localMax = Math.max(localMax, slopeMap.get(slope));
                }
            }

            globalMax = Math.max(globalMax, localMax + samePoint);
        }
        return globalMax;
    }

    private List<Integer> getSlope(int dy, int dx) {
        if (dx == 0) return Arrays.asList(1, 0);
        if (dy == 0) return Arrays.asList(0, 1);

        int d = gcd(dy, dx);
        return Arrays.asList(dy / d, dx / d);
    }

    private int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}