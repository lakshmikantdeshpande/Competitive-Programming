package leetcode.google;

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {

  Deque<Integer> stack;
  Deque<Integer> aux;

  /**
   * initialize your data structure here.
   */
  public MinStack() {
    stack = new ArrayDeque<>();
    aux = new ArrayDeque<>();
  }

  public void push(int x) {
    stack.push(x);
    if (aux.isEmpty() || aux.peek() >= x) {
      aux.push(x);
    } else {
      aux.push(aux.peek());
    }
  }

  public void pop() {
    stack.pop();
    aux.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return aux.peek();
  }
}