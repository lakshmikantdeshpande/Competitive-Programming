package GFG.Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    while (t > 0) {
      HashMap<Integer, Node> m = new HashMap<>();

      int n = Integer.parseInt(br.readLine());

      Node root = null;
      String[] nums = br.readLine().split(" ");

      int mm = n;
      for (int idx = 0; idx < mm; idx++) {

        int n1 = Integer.parseInt(nums[idx * 3]);
        int n2 = Integer.parseInt(nums[idx * 3 + 1]);

        String lr = nums[idx * 3 + 2];


        Node parent = m.get(n1);
        if (parent == null) {
          parent = new Node(n1);
          m.put(n1, parent);
          if (root == null)
            root = parent;
        }
        Node child = new Node(n2);
        if (lr.equals("L"))
          parent.left = child;
        else
          parent.right = child;
        m.put(n2, child);
      }

      PostOrder g = new PostOrder();
      g.postOrder(root);
      System.out.print("");
      t--;
    }
    br.close();
  }
}

class PostOrder {
  void postOrder(Node root) {
    if (root == null) {
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }
}
