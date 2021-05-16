package leetcode.jpmorgan;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

    Map<Integer, Integer> map = new HashMap<>();

    public int numDecodings(String s) {
        return decode(0, s);
    }

    private int decode(int index, String s) {
        if (map.containsKey(index)) {
            return map.get(index);
        }

        if (index == s.length()) {
            return 1;
        }

        if (s.charAt(index) == '0') {
            return 0;
        }

        if (index == s.length() - 1) {
            return 1;
        }

        int answer = decode(index + 1, s);
        if (Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            answer += decode(index + 2, s);
        }
        map.put(index, answer);
        return answer;
    }
}
