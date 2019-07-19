package leetcode.google;

public class InvertBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            val = data;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        TreeNode temp = root.left;
        root.left = right;
        root.right = temp;

        return root;
    }
}
