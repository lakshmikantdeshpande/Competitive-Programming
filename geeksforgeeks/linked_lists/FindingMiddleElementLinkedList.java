package geeksforgeeks.linked_lists;

import java.util.Scanner;


public class FindingMiddleElementLinkedList {
  private Node head;  // head of list

  private void addToTheLast(Node node) {
    if (head == null) {
      head = node;
    } else {
      Node temp = head;
      while (temp.next != null)
        temp = temp.next;
      temp.next = node;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      FindingMiddleElementLinkedList llist = new FindingMiddleElementLinkedList();
      int a1 = sc.nextInt();
      Node head = new Node(a1);
      llist.addToTheLast(head);
      for (int i = 1; i < n; i++) {
        int a = sc.nextInt();
        llist.addToTheLast(new Node(a));
      }

      GFG gfgobj = new GFG();
      System.out.println(gfgobj.getMiddle(llist.head));
      t--;
    }
  }

  private static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }


  private static class GFG {
    // Function to find middle element a linked list
    int getMiddle(Node head) {
      Node slow = head;
      Node fast = head;
      while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
      }
      return slow.data;
    }
  }

}