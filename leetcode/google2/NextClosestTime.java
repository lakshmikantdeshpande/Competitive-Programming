package leetcode.google2;

import java.util.HashSet;
import java.util.Set;

public class NextClosestTime {
    public String nextClosestTime(String time) {
        Set<Integer> digits = buildUniqueDigitSet(time);

        String[] tokens = time.split(":");
        int hours = Integer.parseInt(tokens[0]);
        int minutes = Integer.parseInt(tokens[1]);

        while (true) {
            minutes = (minutes + 1) % 60;
            if (minutes == 0) {
                hours = (hours + 1) % 24;
            }
            String currTime = String.format("%02d:%02d", hours, minutes);
            System.out.println(currTime);
            if (isNextClosest(currTime, digits)) {
                return currTime;
            }
        }
    }

    private boolean isNextClosest(String time, Set<Integer> digits) {
        for (char num : time.toCharArray()) {
            if (num >= '0' && num <= '9') {
                int number = Character.getNumericValue(num);
                if (!digits.contains(number)) {
                    return false;
                }
            }
        }
        return true;
    }

    private Set<Integer> buildUniqueDigitSet(String time) {
        Set<Integer> digits = new HashSet<>();
        for (char num : time.toCharArray()) {
            if (num >= '0' && num <= '9') {
                digits.add(Character.getNumericValue(num));
            }
        }
        return digits;
    }
}
