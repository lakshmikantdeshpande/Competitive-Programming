package leetcode.google;

import practice.TreeNode;

public class MaximumDepthOfBinaryTree {

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
