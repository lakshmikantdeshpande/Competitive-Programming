package leetcode.jpmorgan;

public class ValidateBinarySearchTree {
    private static final class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
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

        boolean left = isBST(root.left, min, root.val);
        boolean right = isBST(root.right, root.val, max);
        return left && right;
    }
}
