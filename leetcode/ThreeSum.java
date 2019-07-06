package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> sumNumbers = new ArrayList<>();
        final int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int sum = 0 - (nums[i] + nums[j]);
                if (map.containsKey(sum)) {
                    List<Integer> list = (Arrays.asList(nums[i], nums[j], sum));
                    Collections.sort(list);
                    boolean added = set.add(list);
                    if (added) {
                        sumNumbers.add(list);
                    }
                }
                map.put(nums[j], j);
            }
        }
        return sumNumbers;
    }
}