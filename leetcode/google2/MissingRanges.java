package leetcode.google2;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int prev = lower - 1;

        for (int i = 0; i <= nums.length; i++) {
            int curr = (i < nums.length) ? nums[i] : upper + 1;
            if (prev + 1 <= curr - 1) {
                ranges.add(format(prev + 1, curr - 1));
            }
            prev = curr;
        }
        return ranges;
    }

    private String format(int lower, int upper) {
        if (lower == upper) {
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }
}
