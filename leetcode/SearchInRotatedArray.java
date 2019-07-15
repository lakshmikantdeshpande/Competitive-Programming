package leetcode;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        /*

        4, 5, 6, 7, 0, 1, 2
                    i
        */

        if (nums.length == 0) {
            return -1;
        }

        // Find pivot
        int pivot = 0;
        for (int i = 0; i < nums.length; ++i)
            if (i > 0 && nums[i] < nums[i - 1]) {
                pivot = i;
                break;
            }

        int left = 0;
        int right = nums.length - 1;

        if (target >= nums[pivot] && target <= nums[right])
            left = pivot;
        else
            right = pivot - 1;

        // Do normal binary search
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;

    }
}

