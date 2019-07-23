package leetcode.google;

public class LongestAbsoluteFilePath {

    public int lengthLongestPath(String input) {
        if (input.isEmpty()) return 0;

        String[] paths = input.split("\n");
        int[] stack = new int[paths.length + 1];
        int max = 0;

        for (String path : paths) {
            int level = path.lastIndexOf("\t") + 1;
            int currentLength = stack[level + 1] = stack[level] + path.length() - level + 1;
            if (path.contains(".")) {
                max = Math.max(max, currentLength - 1);
            }
        }
        return max;
    }
}
