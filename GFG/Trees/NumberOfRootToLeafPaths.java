package GFG.Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NumberOfRootToLeafPaths {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      HashMap<Integer, Node> map = new HashMap<>();
      Node root = null;
      while (n > 0) {
        int one = sc.nextInt();
        int two = sc.nextInt();
        char ch = sc.next().charAt(0);

        Node parent = map.getOrDefault(one, null);
        if (parent == null) {
          parent = new Node(one);
          map.put(one, parent);
          if (root == null) {
            root = parent;
          }
        }

        Node child = new Node(two);
        if (ch == 'L')
          parent.left = child;
        else
          parent.right = child;

        map.put(two, child);

        n--;
      }

      GfG g = new GfG();
      g.countPaths(root);
      System.out.println();

      t--;
    }
  }

  private static class Node {
    int data;
    Node left, right;

    Node(int d) {
      data = d;
      left = right = null;
    }
  }

  private static class GfG {

    Map<Integer, Integer> countMap = new HashMap<>();

    void countPaths(Node root) {
      countPaths(root, 1);
      for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        System.out.print(entry.getKey() + " " + entry.getValue() + " $");
      }
    }

    void countPaths(Node root, int length) {
      if (root == null) {
        return;
      }

      if (root.left == null && root.right == null) {
        countMap.put(length, countMap.getOrDefault(length, 0) + 1);
      }

      countPaths(root.left, length + 1);
      countPaths(root.right, length + 1);
    }
  }
}

