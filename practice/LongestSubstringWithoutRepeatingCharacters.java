import java.util.Map;
import java.util.HashMap;



public class LongestSubstringWithoutRepeatingCharacters {
      public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int count = 0;
        
        for (j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(i, map.get(c));
            }
            count = Math.max(count, j - i + 1);
            map.put(c, j + 1);
        }
        return count;
    }
}
