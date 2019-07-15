package leetcode.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateLetterCombinations {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        List<String> combinations = new ArrayList<>();

        Map<Integer, char[]> map = new HashMap<>();
        map.put(2, "abc".toCharArray());
        map.put(3, "def".toCharArray());
        map.put(4, "ghi".toCharArray());
        map.put(5, "jkl".toCharArray());
        map.put(6, "mno".toCharArray());
        map.put(7, "pqrs".toCharArray());
        map.put(8, "tuv".toCharArray());
        map.put(9, "wxyz".toCharArray());

        generateCombinations(digits, map, 0, "", combinations);
        return combinations;
    }

    private void generateCombinations(String digits, Map<Integer, char[]> map,
                                      int index, String current, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }

        char[] array = map.get(digits.charAt(index) - '0');
        for (int i = 0; i < array.length; i++) {
            generateCombinations(digits, map, index + 1, current + array[i], combinations);
        }
    }
}
