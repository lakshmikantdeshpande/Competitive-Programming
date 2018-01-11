package LinkedLists;

public class ReverseLinkedListInKSizeGroups {

    private static class Node {
        private int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node insert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
        return head;
    }

    private static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }

        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = insert(null, 1);
        insert(head, 2);
        insert(head, 3);
        insert(head, 4);
        insert(head, 5);
        insert(head, 6);
        insert(head, 7);
        insert(head, 8);
        insert(head, 9);

        display(head);
        display(reverseLinkedList(head));
    }

}
