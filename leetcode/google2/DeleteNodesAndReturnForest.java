package leetcode.google2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>(to_delete.length);
        for (int delete : to_delete) {
            set.add(delete);
        }

        List<TreeNode> result = new ArrayList<>();
        if (!set.contains(root.val)) {
            result.add(root);
        }
        dfs(root, set, result);
        return result;
    }

    private TreeNode dfs(TreeNode root, Set<Integer> set, List<TreeNode> result) {
        if (root == null) {
            return null;
        }

        root.left = dfs(root.left, set, result);
        root.right = dfs(root.right, set, result);

        if (set.contains(root.val)) {
            if (root.left != null) {
                result.add(root.left);
            }

            if (root.right != null) {
                result.add(root.right);
            }

            return null;
        }
        return root;
    }

    private static final class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
