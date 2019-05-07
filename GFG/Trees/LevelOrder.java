package GFG.Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Level_Order_Traverse {

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

      LevelOrder g = new LevelOrder();
      g.levelOrder(root);
      System.out.println();
      t--;

    }
  }
}

class LevelOrder {
  void levelOrder(Node root) {
    if (root == null) {
      return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (node != null) {
        System.out.print(node.data + " ");
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
    }
  }
}