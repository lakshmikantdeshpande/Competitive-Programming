package geeksforgeeks.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class NoSiblingNodes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      HashMap<Integer, Node> map = new HashMap<>();
      int n = sc.nextInt();
      Node root = null;
      while (n > 0) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char lr = sc.next().charAt(0);
        Node parent = map.get(n1);
        if (parent == null) {
          parent = new Node(n1);
          map.put(n1, parent);
          if (root == null)
            root = parent;
        }
        Node child = new Node(n2);
        if (lr == 'L')
          parent.left = child;
        else
          parent.right = child;
        map.put(n2, child);
        n--;
      }
      GfG g = new GfG();
      g.printSibling(root);
      System.out.println();
      t--;

    }
  }

  private static class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
      data = item;
      left = right = null;
    }
  }

  private static class GfG {
    void printSibling(Node root) {
      List<Integer> nodes = new ArrayList<>();
      printSibling(root, nodes);
      if (nodes.isEmpty()) {
        System.out.print("-1");
      } else {
        Collections.sort(nodes);
        for (int i : nodes) {
          System.out.print(i + " ");
        }
      }
    }

    private static void printSibling(Node root, List<Integer> nodes) {
      if (root == null) {
        return;
      }

      if (root.left != null && root.right != null) {
        // simply print siblings
      } else if (root.right != null) {
        nodes.add(root.right.data);
      } else if (root.left != null) {
        nodes.add(root.left.data);
      }

      printSibling(root.right, nodes);
      printSibling(root.left, nodes);
    }
  }
}
