package leetcode.google;

import leetcode.TreeNode;

public class InvertBinaryTree {

    private TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        TreeNode temp = left;
        root.left = right;
        root.right = temp;

        return root;
    }
}
