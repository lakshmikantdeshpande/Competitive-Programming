package practice;


import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    private final Deque<Integer> stack = new ArrayDeque<>();
    private final Deque<Integer> auxStack = new ArrayDeque<>();

    public MinStack() {
    }

    public void push(int x) {
        stack.push(x);
        if (auxStack.isEmpty()) {
            auxStack.push(x);
        } else {
            auxStack.push(x <= auxStack.peek() ? x : auxStack.peek());
        }
    }

    public void pop() {
        auxStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return auxStack.peek();
    }
}
