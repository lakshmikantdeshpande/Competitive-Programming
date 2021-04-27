import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int size;
    private int capacity;
    private Node head;
    private Node tail;
    private Map<Integer, Node> cacheMap;

    private static final class Node {
        Node prev;
        Node next;

        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        cacheMap = new HashMap<>(capacity);
    }

    private void removeNode(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void addNode(Node node) {
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    private Node popTail() {
        Node temp = tail.prev;
        removeNode(temp);
        return temp;
    }

    public int get(int key) {
        Node node = cacheMap.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            Node node = cacheMap.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            Node node = new Node(key, value);
            cacheMap.put(key, node);
            addNode(node);

            size++;

            if (size > capacity) {
                Node tail = popTail();
                cacheMap.remove(tail.key);
                size--;
            }
        }
    }
}