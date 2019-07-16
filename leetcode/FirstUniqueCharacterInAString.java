package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    private static class Pair {
        int count;
        int index;

        public Pair(int count, int index) {
            this.count = count;
            this.index = index;
        }

        public String toString() {
            return "{count = " + this.count + " index = " + this.index + "}";
        }
    }

    public int firstUniqChar(String s) {
        Map<Character, Pair> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Pair pair = map.get(c);
            if (pair == null) {
                pair = new Pair(1, i);
            } else {
                pair = new Pair(pair.count + 1, pair.index);
            }
            map.put(c, pair);
        }

        for (Map.Entry<Character, Pair> entry : map.entrySet()) {
            char c = entry.getKey();
            Pair pair = entry.getValue();

            if (pair.count == 1) {
                return pair.index;
            }
        }
        return -1;
    }
}
