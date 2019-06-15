package GFG.Trees;

import java.util.HashMap;
import java.util.Scanner;

class SumOfLeafNodes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      HashMap<Integer, Node> map = new HashMap<>();
      int n = scanner.nextInt();
      Node root = null;
      while (n-- > 0) {
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        char lr = scanner.next().charAt(0);

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
      }

      GfG gfg = new GfG();
      System.out.println(gfg.sumofLeafNodes(root));
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
    int sumofLeafNodes(Node root) {
      return findLeafSum(root, 0);
    }

    private static int findLeafSum(Node root, int sum) {
      if (root == null) {
        return 0;
      }

      if (root.left == null && root.right == null) {
        return sum + root.data;
      }

      return findLeafSum(root.left, sum) + findLeafSum(root.right, sum);
    }
  }
}
