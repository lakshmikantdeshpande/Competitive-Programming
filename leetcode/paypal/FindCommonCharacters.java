package leetcode.paypal;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] master = buildCountArray(words[0]);

        if (words.length == 1) {
            return buildResult(master);
        }

        for (int i = 1; i < words.length; i++) {
            int[] slave = buildCountArray(words[i]);
            combine(master, slave);
        }

        return buildResult(master);
    }

    private List<String> buildResult(int[] master) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < master.length; i++) {
            int count = master[i];
            for (int j = 0; j < count; j++) {
                String val = String.valueOf((char) ('a' + i));
                result.add(val);
            }
        }
        return result;
    }

    private void combine(int[] master, int[] slave) {
        for (int i = 0; i < slave.length; i++) {
            master[i] = Math.min(master[i], slave[i]);
        }
    }

    private int[] buildCountArray(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        return counts;
    }
}
