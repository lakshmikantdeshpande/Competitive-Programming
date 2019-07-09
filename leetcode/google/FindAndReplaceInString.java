package leetcode.google;

import java.util.HashMap;
import java.util.Map;

public class FindAndReplaceInString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        StringBuilder str = new StringBuilder();

        // Create a map which contains index as key, and source, target as values
        Map<Integer, String[]> map = new HashMap<>();
        for (int i = 0; i < indexes.length; i++) {
            map.put(indexes[i], new String[]{sources[i], targets[i]});
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            // if we don't have to replace anything at this index, simply append current character to output
            if (!map.containsKey(i)) {
                str.append(c);
            } else {
                String[] replacement = map.get(i);
                String source = replacement[0];
                String target = replacement[1];

                // if substring from current character till the end of the string starts with source,
                // we can replace it with target, and move ahead by source.length()
                // NOTE: -1 is added for skipping for loops default increment operation
                if (S.substring(i).startsWith(source)) {
                    str.append(target);
                    i += source.length() - 1;
                } else {
                    // if it doesn't, simply add the character to output, and move ahead.
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}
