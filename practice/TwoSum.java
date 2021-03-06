package practice;// N time N space
// N + N time N space
// N * N time 1 space

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] array = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(ts.twoSum(array, 9)));
        System.out.println(Arrays.toString(ts.twoSum1(array, 9)));
        System.out.println(Arrays.toString(ts.twoSum2(array, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                answer[0] = map.get(target - nums[i]);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i], i);
        }
        return answer;
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && i != map.get(diff)) {
                return new int[]{i, map.get(diff)};
            }
        }
        return answer;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return answer;
    }
}
