package leetcode.google;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            if (root == null) {
                return list;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node == null) {
                    if (!queue.isEmpty()) {
                        queue.offer(null);
                        list.add(new ArrayList<>());
                    }
                } else {
                    if (list.isEmpty()) {
                        list.add(new ArrayList<>());
                    }
                    list.get(list.size() - 1).add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            return list;
        }
    }
}
