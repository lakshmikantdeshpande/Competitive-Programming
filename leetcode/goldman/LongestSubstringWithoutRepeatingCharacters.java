package leetcode.goldman;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(i, map.get(c));
            }
            max = Math.max(max, j - i + 1);
            map.put(c, j + 1);
        }
        return max;
    }
}
