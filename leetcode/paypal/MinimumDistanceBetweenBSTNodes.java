package leetcode.paypal;

public class MinimumDistanceBetweenBSTNodes {
    Integer prev = null, answer = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return answer;
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            if (prev != null) {
                answer = Math.min(answer, root.val - prev);
            }
            prev = root.val;
            inorder(root.right);
        }
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
