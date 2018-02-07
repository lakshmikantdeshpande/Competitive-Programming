public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        Node root = new BinaryTree().new Node();
        root.data = 2;
        root.left = new BinaryTree().new Node();
        root.left.data = 1;
        root.right = new BinaryTree().new Node();
        root.right.data = 3;
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }

}
