package leetcode.paypal;

import java.util.HashMap;
import java.util.Map;

public class PaintHouse {
    private int[][] costs;
    private Map<String, Integer> memo;

    public int minCost(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }

        this.costs = costs;
        memo = new HashMap<>();

        return Math.min(paintCost(0, 0), Math.min(paintCost(0, 1), paintCost(0, 2)));
    }

    private int paintCost(int n, int color) {
        if (memo.containsKey(getKey(n, color))) {
            return memo.get(getKey(n, color));
        }

        int cost = costs[n][color];
        if (n == costs.length - 1) {
            // ignore
        } else if (color == 0) {
            cost += Math.min(paintCost(n + 1, 1), paintCost(n + 1, 2));
        } else if (color == 1) {
            cost += Math.min(paintCost(n + 1, 0), paintCost(n + 1, 2));
        } else {
            cost += Math.min(paintCost(n + 1, 0), paintCost(n + 1, 1));
        }
        memo.put(getKey(n, color), cost);
        return cost;
    }

    private String getKey(int index, int color) {
        return String.valueOf(index) + " " + color;
    }
}
