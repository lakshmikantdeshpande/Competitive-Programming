package leetcode.google;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder str = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            for (int i = 0; i < map.get(c); i++) {
                str.append(c);
            }
        }
        return str.toString();
    }
}
