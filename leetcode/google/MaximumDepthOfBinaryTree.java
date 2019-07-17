package leetcode.google;

public class MaximumDepthOfBinaryTree {
    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
