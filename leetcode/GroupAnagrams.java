package leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramList = new ArrayList<>();

        Map<String, List<String>> groupMap = new HashMap<>();
        for (String str : strs) {
            String freqString = buildFreqString(str);
            List<String> anagrams = groupMap.getOrDefault(freqString, new ArrayList<>());
            anagrams.add(str);
            groupMap.put(freqString, anagrams);
        }

        for (List<String> list : groupMap.values()) anagramList.add(list);
        return anagramList;
    }

    private String buildFreqString(String str) {
        char[] array = new char[26];
        for (char c : str.toCharArray()) {
            array[c - 'a']++;
        }
        return Arrays.toString(array);
    }
}
