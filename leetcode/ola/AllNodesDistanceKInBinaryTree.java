package leetcode.ola;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AllNodesDistanceKInBinaryTree {

    private static final class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        dfs(parentMap, root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(null);
        queue.offer(target);

        Set<TreeNode> seen = new HashSet<>();
        seen.add(target);
        seen.add(null);

        int dist = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp == null) {
                if (dist == k) {
                    List<Integer> result = new ArrayList<>();
                    for (TreeNode node : queue) {
                        result.add(node.val);
                    }
                    return result;
                }
                queue.offer(null);
                dist++;
            } else {
                if (!seen.contains(temp.left)) {
                    seen.add(temp.left);
                    queue.offer(temp.left);
                }
                if (!seen.contains(temp.right)) {
                    seen.add(temp.right);
                    queue.offer(temp.right);
                }

                TreeNode parent = parentMap.get(temp);
                if (!seen.contains(parent)) {
                    seen.add(parent);
                    queue.offer(parent);
                }
            }
        }
        return new ArrayList<>();
    }

    private void dfs(Map<TreeNode, TreeNode> parentMap, TreeNode root, TreeNode parent) {
        if (root != null) {
            parentMap.put(root, parent);
            dfs(parentMap, root.left, root);
            dfs(parentMap, root.right, root);
        }
    }
}
