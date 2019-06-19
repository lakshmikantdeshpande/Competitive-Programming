package geeksforgeeks.trees;

import java.util.HashMap;
import java.util.Scanner;


class CheckBalancedTree {

  private static class Node {
    int data;
    Node left, right;

    Node(int d) {
      data = d;
      left = right = null;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      HashMap<Integer, Node> m = new HashMap<Integer, Node>();
      int n = sc.nextInt();
      Node root = null;
      while (n > 0) {

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char lr = sc.next().charAt(0);

        Node parent = m.get(n1);
        if (parent == null) {
          parent = new Node(n1);
          m.put(n1, parent);
          if (root == null)
            root = parent;
        }
        Node child = new Node(n2);
        if (lr == 'L')
          parent.left = child;
        else
          parent.right = child;
        m.put(n2, child);
        n--;
      }

      GfG g = new GfG();
      if (g.isBalanced(root))
        System.out.println(1);
      else
        System.out.println(0);
      t--;
    }
  }

  private static class GfG {
    private static class Height {
      int height;
    }

    boolean isBalanced(Node root) {
      return isBalanced(root, new Height());
    }

    /* This function should return tree if passed  tree
    is balanced, else false. */
    boolean isBalanced(Node root, Height height) {
      if (root == null) {
        height.height = 0;
        return true;
      }

      Height left = new Height();
      Height right = new Height();
      boolean l = isBalanced(root.left, left);
      boolean r = isBalanced(root.right, right);

      height.height = 1 + Math.max(left.height, right.height);
      return l && r && (Math.abs(left.height - right.height) <= 1);
    }
  }
}
