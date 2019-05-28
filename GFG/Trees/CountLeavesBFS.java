package GFG.Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


class CountLeavesBFS {

  private static class Node {
    int data;
    Node left, right;

    Node(int item) {
      data = item;
      left = right = null;
    }
  }

  public static void main(String args[]) throws IOException {
    CountLeavesBFS CLN = new CountLeavesBFS();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t > 0) {
      HashMap<Integer, Node> m = new HashMap<Integer, Node>();

      int n = Integer.parseInt(br.readLine());
      Node root = null;

      String nums[] = br.readLine().split(" ");
      int mm = n;
      for (int idx = 0; idx < mm; idx++) {

        int n1 = Integer.parseInt(nums[idx * 3]);
        int n2 = Integer.parseInt(nums[idx * 3 + 1]);
        String lr = nums[idx * 3 + 2];

        Node parent = m.get(n1);
        if (parent == null) {
          parent = new Node(n1);
          m.put(n1, parent);
          if (root == null)
            root = parent;
        }
        Node child = new Node(n2);
        if (lr.equals("L"))
          parent.left = child;
        else
          parent.right = child;
        m.put(n2, child);
      }

      GfG g = new GfG();
      int res = g.countLeaves(root);
      System.out.println(res);
      //CLN.inorder(root);
      t--;
      // System.out.println();
    }
    br.close();
  }

  private static class GfG {
    int countLeaves(Node root) {
      int leafCount = 0;
      Queue<Node> queue = new LinkedList<>();
      queue.offer(root);
      queue.offer(null);

      while (!queue.isEmpty()) {
        Node node = queue.poll();
        if (node == null) {
          if (!queue.isEmpty()) {
            queue.offer(null);
          }
          continue;
        } else if (node.left == null && node.right == null) {
          leafCount++;
        }

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      return leafCount;
    }
  }
}