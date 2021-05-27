package leetcode.paypal;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int curr = 0;
        boolean down = false;

        for (char c : s.toCharArray()) {
            rows.get(curr).append(c);
            if (curr == 0 || curr == numRows - 1) {
                down = !down;
            }
            curr += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder str : rows) result.append(str);
        return result.toString();
    }

}
