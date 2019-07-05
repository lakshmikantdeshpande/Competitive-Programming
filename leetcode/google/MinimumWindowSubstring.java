package leetcode.google;

public class MinimumWindowSubstring {
    private static String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }

        // frequency map
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int right = 0;
        int left = 0;
        int missing = t.length();
        char[] array = s.toCharArray();

        int i = 0;
        int j = 0;

        while (right < s.length()) {
            if (need[array[right]] > 0) {
                missing--;
            }
            need[array[right]]--;
            right++;

            while (missing == 0) {
                if (j == 0 || (right - left) < (j - i)) {
                    j = right;
                    i = left;
                }
                need[array[left]]++;
                if (need[array[left]] > 0) {
                    missing++;
                }
                left++;
            }
        }
        return s.substring(i, j);
    }

    public static void main(String[] args) {
        String source = "ADOBECODEBANC";
        String substring = "ABC";

        System.out.println(minWindow(source, substring));
    }
}
