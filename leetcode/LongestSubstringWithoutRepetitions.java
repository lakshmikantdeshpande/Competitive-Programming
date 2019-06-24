package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepetitions {

    private static int lengthOfLongestSubstringOptimal(String str) {
        int max = 0;
        int i = 0;
        int j = 0;
        int n = str.length();

        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {
            char c = str.charAt(j);
            if (set.contains(c)) {
                set.remove(str.charAt(i++));
            } else {
                set.add(str.charAt(j++));
                max = Math.max(max, set.size());
            }
        }
        return max;
    }

    // fastest
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int max = 0;
        int i = 0;
        int j = 0;
        final int n = s.length();
        Map<Character, Integer> map = new HashMap<>(n);
        while (j < n) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            max = Math.max(max, j - i + 1);
            map.put(s.charAt(j), j + 1);
            j++;
        }
        return max;
    }

    // Brute force
    private static int lengthOfLongestSubstringBrute(String str) {
        int maxLength = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (areAllUnique(str, i, j)) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }

        return maxLength;
    }

    private static boolean areAllUnique(String str, int i, int j) {
        Set<Character> visited = new HashSet<>();
        for (; i < j; i++) {
            boolean added = visited.add(str.charAt(i));
            if (!added) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringBrute("aaababababaa"));
        System.out.println(lengthOfLongestSubstringOptimal("aaababababaa"));
    }
}


