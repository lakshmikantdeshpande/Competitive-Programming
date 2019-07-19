package practice;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0) return 0;
        int max = 0;
        int i = 0;
        int j = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (j < tree.length) {
            if (map.size() <= 2) {
                map.put(tree[j], j++);
            }

            if (map.size() > 2) {
                int min = tree.length - 1;
                for (int val : map.values()) {
                    min = Math.min(min, val);
                }

                i = min + 1;
                map.remove(tree[min]);
            }
            max = Math.max(max, j - i);
        }

        return max;
    }
}
