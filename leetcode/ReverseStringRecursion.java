package leetcode;

public class ReverseStringRecursion {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int i, int j) {
        if (i > j) return;
        swap(s, i, j);
        reverse(s, ++i, --j);
    }

    private void swap(char[] s, int i, int j) {
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
}
