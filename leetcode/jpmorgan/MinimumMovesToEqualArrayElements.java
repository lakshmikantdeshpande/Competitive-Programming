package leetcode.jpmorgan;

public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int num : nums) {
            count += num;
            min = Math.min(min, num);
        }
        return count  - (min * nums.length);
    }
}
