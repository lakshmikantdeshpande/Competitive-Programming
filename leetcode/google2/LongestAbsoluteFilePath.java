package leetcode.google2;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        String[] paths = input.split("\n");
        for (String path : paths) {
            int level = path.lastIndexOf("\t") + 1;
            path = path.replaceAll("\t", "");
            while (level + 1 < stack.size()) {
                stack.pop();
            }

            int curr = path.length() + stack.peek() + 1;
            stack.push(curr);
            if (path.contains(".")) {
                max = Math.max(max, curr - 1);
            }
        }
        return max;
    }
}
