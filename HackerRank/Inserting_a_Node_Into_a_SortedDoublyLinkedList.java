import java.io.PrintWriter;
import java.util.Scanner;

class Inserting_a_Node_Into_a_SortedDoublyLinkedList {
    private static Node SortedInsert(Node head, int data) {
        Node temp = new Node();
        temp.data = data;

        if (head == null)
            return temp;
        else if (head.data > data) {
            temp.next = head;
            head.prev = temp;
            return temp;
        } else {
            Node t = head;
            while (t.next != null && t.next.data <= data)
                t = t.next;
            temp.next = t.next;
            if (t.next != null)
                t.next.prev = temp;
            t.next = temp;
            temp.prev = t;
            return head;
        }
    }

    private static void display(Node node) {
        if (node != null) {
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            Node temp = null;
            while (N-- > 0) {
                temp = SortedInsert(temp, scanner.nextInt());
            }
            display(temp);
        }
    }

    static class Node {
        int data;
        Node next;
        Node prev;
    }

}