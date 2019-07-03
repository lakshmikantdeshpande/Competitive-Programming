package leetcode.google;

import java.util.Set;
import java.util.TreeSet;

public class NextClosestTime {
    public String nextClosestTime(String time) {
        String[] tokens = time.split(":");
        int minutes = Integer.parseInt(tokens[0]) * 60;
        minutes += Integer.parseInt(tokens[1]);

        Set<Integer> digits = new TreeSet<>();
        for (char c : time.toCharArray()) {
            if (c == ':') continue;
            digits.add(c - '0');
        }

        while (true) {
            minutes = (minutes + 1) % (24 * 60);
            int[] nextTime = {minutes / 60 / 10, minutes / 60 % 10, minutes % 60 / 10, minutes % 60 % 10};

            boolean isValid = true;
            for (int digit : nextTime) {
                if (!digits.contains(digit)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                return String.format("%02d:%02d", minutes / 60, minutes % 60);
            }
        }
    }
}
