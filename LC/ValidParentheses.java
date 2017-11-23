import java.util.Stack;

class ValidParenthes {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        } else if (s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if ((c == '(' && stack.peek() == ')') || (c == ')' && stack.peek() == '(') ||
                    (c == '{' && stack.peek() == '}') || (c == '}' && stack.peek() == '{') ||
                    (c == '[' && stack.peek() == ']') || (c == ']' && stack.peek() == '[')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}