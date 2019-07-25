package leetcode.google;

public class LongestPalindormicString {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        final int n = s.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            int one = expand(s, i, i);
            int two = expand(s, i, i + 1);
            int len = Math.max(one, two);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
