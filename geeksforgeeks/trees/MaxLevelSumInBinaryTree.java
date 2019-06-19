package geeksforgeeks.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MaxLevelSumInBinaryTree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      Node root = null;
      for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        if (root == null) {
          root = new Node(a);
          switch (c) {
            case 'L':
              root.left = new Node(b);
              break;
            case 'R':
              root.right = new Node(b);
              break;
          }
        } else {
          insert(root, a, b, c);
        }
      }
      System.out.println(GfG.maxLevelSum(root));
    }
  }

  private static void insert(Node root, int a, int b, char c) {
    if (root == null)
      return;
    if (root.data == a) {
      switch (c) {
        case 'L':
          root.left = new Node(b);
          break;
        case 'R':
          root.right = new Node(b);
          break;
      }
    } else {
      insert(root.left, a, b, c);
      insert(root.right, a, b, c);
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
    static int maxLevelSum(Node root) {
      int max = Integer.MIN_VALUE;
      int sum = 0;
      Queue<Node> queue = new LinkedList<>();
      queue.offer(root);
      queue.offer(null);

      while (!queue.isEmpty()) {
        Node node = queue.poll();
        if (node == null) {
          max = Math.max(max, sum);
          if (!queue.isEmpty()) {
            queue.offer(null);
          }
          sum = 0;
        } else {
          if (node.left != null) {
            queue.offer(node.left);
          }
          if (node.right != null) {
            queue.offer(node.right);
          }
          sum += node.data;
        }
      }
      return max;
    }
  }
}
