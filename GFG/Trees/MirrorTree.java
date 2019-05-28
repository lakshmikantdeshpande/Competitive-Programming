package GFG.Trees;

import java.util.HashMap;
import java.util.Scanner;


class MirrorTree {

  private static class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
      data = item;
      left = right = null;
    }
  }

  private void inOrder(Node node) {
    if (node == null) {
      return;
    }

    inOrder(node.left);
    System.out.print(node.data + " ");

    inOrder(node.right);
  }

  // driver function to test the above functions
  public static void main(String[] args) {
    // Input the number of test cases you want to run
    Scanner sc = new Scanner(System.in);
    MirrorTree mt = new MirrorTree();
    int t = sc.nextInt();
    while (t > 0) {
      HashMap<Integer, Node> m = new HashMap<>();
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
      g.mirror(root);
      mt.inOrder(root);
      System.out.println();
      t--;
    }
  }

  private static class GfG {
    void mirror(Node root) {
      root = doMirror(root);
    }

    Node doMirror(Node node) {
      if (node == null)
        return node;
      Node left = doMirror(node.left);
      Node right = doMirror(node.right);

      node.left = right;
      node.right = left;
      return node;
    }
  }
}
