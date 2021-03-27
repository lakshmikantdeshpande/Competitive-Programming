package leetcode.google2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindRootOfNaryTree {

    public Node findRootO1XOR(List<Node> tree) {
        long sum = 0L;
        for (Node node : tree) {
            sum ^= node.val;

            for (Node child : node.children) {
                sum ^= child.val;
            }
        }

        for (Node node : tree) {
            if (node.val == sum) {
                return node;
            }
        }
        return null;
    }

    public Node findRootO1Sum(List<Node> tree) {
        long sum = 0L;
        for (Node node : tree) {
            sum += node.val;

            for (Node child : node.children) {
                sum -= child.val;
            }
        }

        for (Node node : tree) {
            if (node.val == sum) {
                return node;
            }
        }
        return null;
    }

    public Node findRoot(List<Node> tree) {
        Map<Node, Set<Node>> map = new HashMap<>(tree.size());
        Node last = null;
        for (Node node : tree) {
            map.put(node, new HashSet<>(node.children));
            last = node;
        }
        return swim(last, map);
    }

    private Node swim(Node last, Map<Node, Set<Node>> map) {
        for (Map.Entry<Node, Set<Node>> entry : map.entrySet()) {
            Set<Node> children = entry.getValue();
            if (children.contains(last)) {
                return swim(entry.getKey(), map);
            }
        }
        return last;
    }

    private static final class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        public Node(int _val, ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}


