package leetcode.google;

import leetcode.TreeNode;

public class MaximumDepthOfBinaryTree {

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
