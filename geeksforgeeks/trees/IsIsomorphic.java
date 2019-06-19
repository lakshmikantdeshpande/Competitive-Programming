package geeksforgeeks.trees;

import java.util.Objects;
import java.util.Scanner;

class Tree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = n;
      Node root1 = null;
      Node root2 = null;
      while (n-- > 0) {
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        char lr = sc.next().charAt(0);
        if (root1 == null) {
          root1 = new Node(a1);
          switch (lr) {
            case 'L':
              root1.left = new Node(a2);
              break;
            case 'R':
              root1.right = new Node(a2);
              break;
          }
        } else {
          insert(root1, a1, a2, lr);
        }
      }
      while (m-- > 0) {
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        char lr = sc.next().charAt(0);
        if (root2 == null) {
          root2 = new Node(a1);
          switch (lr) {
            case 'L':
              root2.left = new Node(a2);
              break;
            case 'R':
              root2.right = new Node(a2);
              break;
          }
        } else {
          insert(root2, a1, a2, lr);
        }
      }
      //inorder(root1);
      //System.out.println();
      //inorder(root2);
      IsIsomorphic isIsomorphic = new IsIsomorphic();
      if (isIsomorphic.isIsomorphic(root1, root2)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  public static void insert(Node root, int a1, int a2, char lr) {
    if (root == null) {
      return;
    }
    if (root.data == a1) {
      switch (lr) {
        case 'L':
          root.left = new Node(a2);
          break;
        case 'R':
          root.right = new Node(a2);
          break;
      }
    } else {
      insert(root.left, a1, a2, lr);
      insert(root.right, a1, a2, lr);
    }
  }

  public static void inorder(Node root) {
    if (root == null)
      return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }
}

class IsIsomorphic {
  boolean isIsomorphic(Node one, Node two) {
    if (Objects.isNull(one) && Objects.isNull(two)) {
      return true;
    }
    if (Objects.isNull(one) || Objects.isNull(two)) {
      return false;
    }
    if (one.data != two.data) {
      return false;
    }

    return (isIsomorphic(one.left, two.left)
        && isIsomorphic(one.right, two.right)
        || isIsomorphic(one.left, two.right)
        && isIsomorphic(one.right, two.left));
  }
}