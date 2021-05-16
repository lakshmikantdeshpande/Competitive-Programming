package leetcode.jpmorgan;

import java.util.ArrayList;
import java.util.List;

public class CountBinaryStrings {

    public int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                curr++;
            } else {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        return ans + Math.min(prev, curr);
    }

    public int countBinarySubstringsBrute(String s) {
        List<Integer> groups = new ArrayList<>();
        groups.add(1);
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);
            if (curr == prev) {
                groups.set(groups.size() - 1, groups.get(groups.size() - 1) + 1);
            } else {
                groups.add(1);
            }
        }

        int ans = 0;
        for (int i = 1; i < groups.size(); i++) {
            ans += Math.min(groups.get(i - 1), groups.get(i));
        }
        return ans;
    }
}
