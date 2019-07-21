package leetcode.google;

import leetcode.TreeNode;

public class FlipEquivalentBinaryTrees {

    private boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        boolean isLeftEqualToRight = flipEquiv(root1.left, root2.right);
        boolean isRightEqualToLeft = flipEquiv(root1.right, root2.left);
        boolean areLeftEqual = flipEquiv(root1.left, root2.left);
        boolean areRightEqual = flipEquiv(root1.right, root2.right);
        return (isLeftEqualToRight && isRightEqualToLeft) || (areLeftEqual && areRightEqual);
    }
}
