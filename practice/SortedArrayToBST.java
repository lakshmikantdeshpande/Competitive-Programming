package practice;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = toBST(nums, start, mid - 1);
        current.right = toBST(nums, mid + 1, end);
        return current;
    }
}
