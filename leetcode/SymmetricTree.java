package leetcode;

public class SymmetricTree {

    private boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        boolean isLeftSymmetric = isSymmetric(left.left, right.right);
        boolean isRightSymmetric = isSymmetric(left.right, right.left);

        return left.val == right.val && isLeftSymmetric && isRightSymmetric;
    }
}
