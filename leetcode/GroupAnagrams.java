package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String hash = hash(str);
            List<String> list = map.getOrDefault(hash, new ArrayList<>());
            list.add(str);
            map.put(hash, list);
        }

        return new ArrayList<>(map.values());
    }

    private String hash(String str) {
        int[] hashtable = new int[26];
        for (char c : str.toCharArray()) {
            hashtable[c - 'a']++;
        }
        return Arrays.toString(hashtable);
    }
}
