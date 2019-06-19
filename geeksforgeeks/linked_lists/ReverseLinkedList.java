package geeksforgeeks.linked_lists;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReverseLinkedList {
  private static PrintWriter out;
  private Node head;  // head of lisl
  private Node lastNode;

  /* Drier program to test above functions */
  public static void main(String[] args) throws IOException {
        /* Constructed Linked List is 1->2->3->4->5->6->
         7->8->8->9->null */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new BufferedOutputStream(System.out));
    int t = Integer.parseInt(br.readLine());
    while (t > 0) {
      int n = Integer.parseInt(br.readLine());
      ReverseLinkedList llist = new ReverseLinkedList();
      String[] nums = br.readLine().split(" ");
      if (n > 0) {
        int a1 = Integer.parseInt(nums[0]);
        Node head = new Node(a1);
        llist.addToTheLast(head);
      }
      for (int i = 1; i < n; i++) {
        int a = Integer.parseInt(nums[i]);
        llist.addToTheLast(new Node(a));
      }
      llist.head = new GFG().reverse(llist.head);

      llist.printList();

      t--;
    }
    out.close();
  }

  private void addToTheLast(Node node) {
    if (head == null) {
      head = node;
      lastNode = node;
    } else {
      lastNode.next = node;
      lastNode = node;
    }
  }

  /* Function to print linked list */
  private void printList() {
    Node temp = head;
    while (temp != null) {
      out.print(temp.data + " ");
      temp = temp.next;
    }
    out.println();
  }

  private static class Node {
    int data;
    Node next;

    Node(int value) {
      this.data = value;
    }
  }

  private static class GFG {
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverse(Node head) {
      Node prev = null, next = null;
      Node current = head;

      while (current != null) {
        next = current.next;
        current.next = prev;
        // Move prev and current ahead
        prev = current;
        current = next;
      }
      head = prev;
      return head;
    }
  }
}

