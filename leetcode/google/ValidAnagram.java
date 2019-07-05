package leetcode.google;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>(s.length());
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : t.toCharArray()) {
            Integer count = map.get(c);
            if (count == null || count <= 0) return false;
            map.put(c, count - 1);
        }
        return true;
    }
}

