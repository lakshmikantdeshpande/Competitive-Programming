package leetcode;

public class MergeTwoBinaryTrees {
  private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    // If both of the treenodes are null, there is no point in processing
    if (t1 == null && t2 == null) {
      return null;
    }

    int sum = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
    TreeNode node = new TreeNode(sum);

    // Left and right nodes of this new node should be left and right nodes of t1 and t2
    node.left = mergeTrees(t1 != null ? t1.left : null, t2 != null ? t2.left : null);
    node.right = mergeTrees(t1 != null ? t1.right : null, t2 != null ? t2.right : null);
    // Return this new node
    return node;
  }

  private static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
