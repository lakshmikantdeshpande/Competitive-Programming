package GFG.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ExpressionTree {
  static Node root;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      String[] s = new String[n];
      for (int i = 0; i < n; i++)
        s[i] = sc.next();
      GfG g = new GfG();

      root = null;
      makeTree(s, n);
      System.out.println(g.evalTree(root));
    }
  }


  public static void makeTree(String[] s, int n) {
    Queue<Node> queue = new LinkedList<>();
    root = new Node(s[0]);
    queue.add(root);
    int p = 1;
    try {
      while (n > 0) {
        Node proot = queue.poll();
        proot.left = new Node(s[p]);
        queue.add(proot.left);
        p++;
        n--;
        if (n > 0) {
          proot.right = new Node(s[p]);
          queue.add(proot.right);
          p++;
          n--;
        }
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
    }
  }

  private static class Node {
    String data;
    Node left, right;

    Node(String d) {
      data = d;
      left = null;
      right = null;
    }
  }

  private static class GfG {
    int evalTree(Node root) {
      if (root == null) {
        return 0;
      } else if (root.left == null && root.right == null) {
        return Integer.parseInt(root.data);
      }

      int left = evalTree(root.left);
      int right = evalTree(root.right);

      switch (root.data) {
        case "+":
          return left + right;
        case "-":
          return left - right;
        case "*":
          return left * right;
        default:
          return left / right;
      }
    }
  }
}
