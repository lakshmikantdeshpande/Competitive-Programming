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
            Map<List<Integer>, Integer> map = new HashMap<>();

            for (int j = i + 1; j < points.length; j++) {
                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];

                if (dx == 0 && dy == 0) {
                    samePoint++;
                } else {
                    List<Integer> slope = getSlope(dx, dy);
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                    localMax = Math.max(localMax, map.get(slope));
                }
            }
            globalMax = Math.max(globalMax, localMax + samePoint);
        }
        return globalMax;
    }

    private List<Integer> getSlope(int x, int y) {
        if (x == 0) {
            return Arrays.asList(0, 1);
        } else if (y == 0) {
            return Arrays.asList(1, 0);
        }

        int gcd = gcd(x, y);
        return Arrays.asList(x / gcd, y / gcd);
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }
}