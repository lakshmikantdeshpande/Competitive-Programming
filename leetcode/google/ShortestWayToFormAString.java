package leetcode.google;

public class ShortestWayToFormAString {
    public int shortestWay(String source, String target) {
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();
        int position = 0;
        int count = 0;

        while (position < t.length) {
            int current = position;
            // move ahead
            position = findNextIndex(position, s, t);
            // if matching character/s are not found, return -1
            if (current == position) {
                return -1;
            }
            count++;
        }
        return count;
    }

    private int findNextIndex(int position, char[] s, char[] t) {
        for (int i = 0; i < s.length && position < t.length; i++) {
            if (s[i] == t[position]) {
                position++;
            }
        }
        return position;
    }
}
