package GFG.Trees;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class VerticalSum {
  private static void insert(Node root, int a, int a1, char lr) {
    if (root == null) {
      return;
    }
    if (root.data == a) {
      switch (lr) {
        case 'L':
          root.left = new Node(a1);
          break;
        case 'R':
          root.right = new Node(a1);
          break;
      }
      return;
    }
    insert(root.left, a, a1, lr);
    insert(root.right, a, a1, lr);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      if (n == 0) {
        System.out.println(0);
        continue;
      }
      Node root = null;
      for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        int a1 = sc.nextInt();
        char lr = sc.next().charAt(0);
        if (i == 0) {
          root = new Node(a);
          switch (lr) {
            case 'L':
              root.left = new Node(a1);
              break;
            case 'R':
              root.right = new Node(a1);
              break;
          }
        } else {
          insert(root, a, a1, lr);
        }
      }
      GfG.printVertical(root);
      System.out.println();

    }

  }

  private static class Node {
    int data;
    Node left, right;

    Node(int key) {
      data = key;
      left = right = null;
    }
  }

  private static class GfG {
    static void printVertical(Node root) {
      int column = 0;
      Map<Integer, Integer> map = new TreeMap<>();
      verticalSum(root, column, map);
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        System.out.print(entry.getValue() + " ");
      }
    }

    private static void verticalSum(Node root, int column, Map<Integer, Integer> map) {
      if (root == null) {
        return;
      }
      verticalSum(root.left, column - 1, map);
      map.put(column, map.getOrDefault(column, 0) + root.data);
      verticalSum(root.right, column + 1, map);
    }

  }
}
