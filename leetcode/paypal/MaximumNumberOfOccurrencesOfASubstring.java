package leetcode.paypal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfOccurrencesOfASubstring {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length() - minSize + 1; i++) {
            String curr = s.substring(i, i + minSize);
            if (isValid(curr, maxLetters)) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
                max = Math.max(max, map.get(curr));
            }
        }
        return max;
    }

    private boolean isValid(String curr, int maxLetters) {
        Set<Character> set = new HashSet<>();
        for (char c : curr.toCharArray()) {
            set.add(c);
        }
        return set.size() <= maxLetters;
    }
}
