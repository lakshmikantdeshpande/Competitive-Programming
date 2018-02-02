import java.util.ArrayList;
import java.util.Stack;

public class PostfixEvaluation {
    public int evalRPN(ArrayList<String> A) {
        if (A == null || A.isEmpty()) {
            return 0;
        }

        Stack<Integer> numbers = new Stack<>();
        for (String num : A) {
            if (num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/")) {
                int temp1 = numbers.pop();
                int temp2 = numbers.pop();
                numbers.push(operate(num, temp1, temp2));

            } else {
                numbers.push(Integer.parseInt(num));
            }
        }
        return numbers.pop();
    }

    private static int operate(String operation, int temp1, int temp2) {
        switch (operation) {
            case "+":
                return temp2 + temp1;
            case "-":
                return temp2 - temp1;
            case "*":
                return temp2 * temp1;
            case "/":
                return temp2 / temp1;
            default:
                throw new IllegalArgumentException("Something\'s not right");
        }
    }
}
