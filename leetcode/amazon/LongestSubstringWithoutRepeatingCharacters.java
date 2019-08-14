package leetcode.amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int bruteForce(String s) {
        int len = 0;
        final int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (areAllUnique(s, i, j)) {
                    len = Math.max(len, j - i);
                }
            }
        }
        return len;
    }

    private boolean areAllUnique(String s, int i, int j) {
        Set<Character> set = new HashSet<>();
        for (int x = i; x < j; x++) {
            char c = s.charAt(x);
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int twoIterations(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() <= 1) {
            return s.length();
        }

        int i = 0;
        int j = 1;
        final int n = s.length();
        int len = 1;

        Set<Character> set = new HashSet<>();
        set.add(s.charAt(i));

        while (i < n && j < n) {
            char c = s.charAt(j);
            if (set.add(c)) {
                j++;
                len = Math.max(len, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return len;
    }

    public int lengthOfLongestSubstring(String s) {
        final int n = s.length();
        int i = 0;
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(map.get(c), i);
            }

            len = Math.max(len, j - i + 1);
            map.put(c, j + 1);
        }
        return len;
    }
}
