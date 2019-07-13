package leetcode.google;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            int frequency = map.getOrDefault(c, 0);
            if (frequency == 0) return c;

            map.put(c, frequency - 1);
        }

        return '!';
    }
}
