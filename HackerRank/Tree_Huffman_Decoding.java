class Tree_Huffman_Decoding {
    class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }

    void decode(String S, Node root) {
        if (root == null) {
            System.out.print("");
        }

        StringBuilder strb = new StringBuilder();
        Node temp = root;
        for (char c : S.toCharArray()) {
            if (c == '1') {
                assert root != null;
                root = root.right;
            } else {
                assert root != null;
                root = root.left;
            }
            if (root.data != '\0') {
                strb.append(root.data);
                root = temp;
            }
        }
        System.out.println(strb.toString());
    }
}
