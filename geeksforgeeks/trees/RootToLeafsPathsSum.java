package geeksforgeeks.trees;

import java.util.Scanner;

class RootToLeafsPathsSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      Tree root = null;
      if (n == 0) {
        System.out.println("0");
        continue;
      }
      if (n == 1) {
        System.out.println(sc.nextInt());
        continue;
      } else {
        while (n-- > 0) {
          int n1 = sc.nextInt();
          int n2 = sc.nextInt();
          char lr = sc.next().charAt(0);
          if (root == null) {
            root = new Tree(n1);
            switch (lr) {
              case 'L':
                root.left = new Tree(n2);
                break;
              case 'R':
                root.right = new Tree(n2);
                break;
            }
          } else {
            insert(root, n1, n2, lr);
          }
        }
      }
      System.out.println(GfG.treePathsSum(root));
    }
  }

  private static class Tree {
    int data;
    Tree left, right;

    Tree(int d) {
      data = d;
      left = null;
      right = null;
    }
  }

  private static void insert(Tree root, int n1, int n2, char lr) {
    if (root == null)
      return;
    if (root.data == n1) {
      switch (lr) {
        case 'L':
          root.left = new Tree(n2);
          break;
        case 'R':
          root.right = new Tree(n2);
          break;
      }
    } else {
      insert(root.left, n1, n2, lr);
      insert(root.right, n1, n2, lr);
    }
  }

  private static class GfG {
    static int treePathsSum(Tree root) {
      return findPaths(root, 0);
    }

    private static int findPaths(Tree root, int sum) {
      if (root == null) return 0;
      sum = sum * 10 + root.data;
      if (root.left == null && root.right == null) {
        return sum;
      }

      return findPaths(root.left, sum) + findPaths(root.right, sum);
    }
  }
}

