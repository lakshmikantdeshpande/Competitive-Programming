package leetcode.jpmorgan;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int left = 0, right = findSum(nums);

        for (int i = 0; i < nums.length; i++) {
            if (left == right - nums[i]) {
                return i;
            }
            left += nums[i];
            right -= nums[i];
        }
        return -1;
    }

    private int findSum(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }
}
