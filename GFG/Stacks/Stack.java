package Stacks;

public class Stack {

  private int top = -1;
  private Node head = null;

  public static void main(String[] args) {
    Stack stack = new Stack();
    for (int i = 0; i < 5; i++) {
      stack.push(i);
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(stack.peek());
      System.out.println(stack.pop());
      System.out.println(stack.isEmpty());
    }
  }

  public void push(int data) {
    top++;
    if (head == null) {
      head = new Node(data);
    } else {
      Node temp = head;
      head = new Node(data);
      head.next = temp;
    }
  }

  public int pop() {
    top--;
    int data = peek();
    head = head.next;
    System.gc();
    return data;
  }

  public int peek() {
    if (head == null) {
      throw new RuntimeException("Stack is empty");
    }
    return head.data;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  private static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }


}
