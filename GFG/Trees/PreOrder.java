package GFG.Trees;

import java.util.HashMap;
import java.util.Scanner;

class PreOrderInput {
  public static void main(String[] args) {

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
      PreOrder g = new PreOrder();
      g.preorder(root);
      System.out.print("");
      t--;
    }
  }
}

class PreOrder {
  void preorder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }
}