package leetcode.jpmorgan;

import java.util.concurrent.ThreadLocalRandom;

public class ShuffleAnArray {

    private final int[] nums;
    private final int[] original;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.original = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            original[i] = nums[i];
        }
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        int[] backup = new int[original.length];
        for (int i = 0; i < nums.length; i++) {
            backup[i] = original[i];
        }
        return backup;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int k = 0; k < nums.length; k++) {
            int i = ThreadLocalRandom.current().nextInt(0, nums.length);
            int j = ThreadLocalRandom.current().nextInt(0, nums.length);
            swap(i, j);
        }
        return nums;
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
