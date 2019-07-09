package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String maxStr = "";
        int max = 0;
        String[] cleaned = cleanParagraph(paragraph).split(" ");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : cleaned) {
            if (bannedSet.contains(word)) continue;
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            int curMax = freqMap.get(word);
            if (max < curMax) {
                max = curMax;
                maxStr = word;
            }
        }

        return maxStr;
    }

    private String cleanParagraph(String paragraph) {
        String intermediate = paragraph.replaceAll("\\p{Punct}", " ").toLowerCase();
        return intermediate.replaceAll(" +", " ");
    }
}
