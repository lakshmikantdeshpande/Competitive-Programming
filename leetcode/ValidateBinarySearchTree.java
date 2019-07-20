package leetcode;

public class ValidateBinarySearchTree {

    private static class TreeNode {
        TreeNode left, right;
        int val;
    }

    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }

        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
}
