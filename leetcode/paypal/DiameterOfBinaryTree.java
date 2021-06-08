package leetcode.paypal;

public class DiameterOfBinaryTree {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    private int longestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = longestPath(root.left);
        int right = longestPath(root.right);

        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }

    private static final class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
