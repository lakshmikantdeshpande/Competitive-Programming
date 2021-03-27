package leetcode.google2;

public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int maxlen = 1;
        int curr = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > last) {
                curr++;
                maxlen = Math.max(curr, maxlen);
            } else {
                curr = 1;
            }
            last = nums[i];
        }
        return maxlen;
    }
}
