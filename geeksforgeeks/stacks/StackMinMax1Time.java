package Stacks;

public class StackMinMax1Time {

  private Node head;
  private int min = Integer.MAX_VALUE;
  private int max = Integer.MIN_VALUE;

  public static void main(String[] args) {
    StackMinMax1Time stack = new StackMinMax1Time();
    int[] array = new int[]{18, 19, 29, 15, 16};

    for (int arr : array) {
      stack.push(arr);
    }

    System.out.println();
    System.out.println(stack.getMax());
    System.out.println(stack.getMin());

    for (int arr : array) {
      stack.pop();
    }

  }

  void push(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }
    min = Math.min(min, data);
    max = Math.max(max, data);

    Node temp = head;
    head = new Node(data);
    head.next = temp;
  }

  int pop() {
    if (head == null) {
      throw new RuntimeException("Stack is empty");
    }
    int pop = head.data;
    head = head.next;

    min = Math.min(min, peek());
    max = Math.max(max, peek());
    return pop;
  }

  int peek() {
    if (head == null) {
      return Integer.MIN_VALUE;
    }
    return head.data;
  }

  int getMin() {
    return min;
  }

  int getMax() {
    return max;
  }

  private static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

}
