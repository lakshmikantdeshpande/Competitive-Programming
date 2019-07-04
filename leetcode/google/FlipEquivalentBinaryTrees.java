package leetcode.google;

public class FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        boolean isLeftEqualToRight = flipEquiv(root1.left, root2.right);
        boolean isRightEqualToLeft = flipEquiv(root1.right, root2.left);
        boolean areLeftEqual = flipEquiv(root1.left, root2.left);
        boolean areRightEqual = flipEquiv(root1.right, root2.right);
        return (isLeftEqualToRight && isRightEqualToLeft) || (areLeftEqual && areRightEqual);
    }

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
    }
}