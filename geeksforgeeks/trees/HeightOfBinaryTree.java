package geeksforgeeks.trees;

import java.util.HashMap;
import java.util.Scanner;

class Tree_Height {
  public static void main(String[] args) {

    // Input the number of test cases you want to run
    Scanner sc = new Scanner(System.in);
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

      HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();

      System.out.println(heightOfBinaryTree.height(root));
      t--;
    }
  }
}

class HeightOfBinaryTree {
  int height(Node node) {
    if (node == null) {
      return 0;
    }
    return Math.max(height(node.left), height(node.right)) + 1;
  }
}