package leetcode.google;

import java.util.HashMap;
import java.util.Map;

public class ConfusingNumber {
    public boolean confusingNumber(int N) {
        if (N == 0) return false;
        Map<Integer, Integer> flipMap = getFlipMap();
        int sum = 0;
        int temp = N;
        while (temp > 0) {
            int lsb = temp % 10;
            if (!flipMap.containsKey(lsb)) return false;
            lsb = flipMap.get(lsb);
            sum = sum * 10 + lsb;
            temp /= 10;
        }
        return sum != N;
    }

    private Map<Integer, Integer> getFlipMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);
        return map;
    }
}
