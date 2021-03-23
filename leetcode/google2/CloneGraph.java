package leetcode.google2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node newNode = new Node(node.val, new ArrayList<>());
        visited.put(node, newNode);

        for (Node curr : node.neighbors) {
            newNode.neighbors.add(cloneGraph(curr));
        }
        return newNode;
    }

    private static final class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
