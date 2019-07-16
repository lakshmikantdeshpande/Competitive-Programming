package leetcode.google;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInTheArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // Make sure that index is not negative
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] < 0) {
                continue; // should not happen ideally
            }
            nums[val] = -nums[val];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                output.add(i + 1);
            }
        }
        return output;
    }
}
