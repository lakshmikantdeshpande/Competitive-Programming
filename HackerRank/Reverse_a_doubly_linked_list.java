import java.io.PrintWriter;
import java.util.Scanner;

class Reverse_a_doubly_linked_list {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node Reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head;
        Node last = head;

        while (temp != null) {
            Node backup = temp.prev;
            temp.prev = temp.next;
            temp.next = backup;
            last = temp;
            temp = temp.prev;
        }

        return last;
    }

    private static void display(Node t) {
        Node node = t;
        if (node != null) {
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Node p = new Node(0);
        p.next = new Node(1);
        p.next.prev = p;
        display(p);
        display(Reverse(p));

        pw.close();
        scanner.close();
    }
}
