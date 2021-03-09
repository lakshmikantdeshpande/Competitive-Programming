package practice;

import java.util.ArrayDeque;
import java.util.Deque;

class ValidParentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '(' && c == ')') stack.pop();
                else if (stack.peek() == '[' && c == ']') stack.pop();
                else if (stack.peek() == '{' && c == '}') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}