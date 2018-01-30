import java.util.Stack;

public class SimplifyDirectoryPath {

    public String simplifyPath(String A) {
        if (A == null || A.isEmpty()) {
            return A;
        }

        String[] array = A.split("/");
        Stack<String> stack = new Stack<>();
        for (String temp : array) {
            if (temp.isEmpty() || temp.equals(".")) {
            } else if (temp.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(temp);
            }
        }

        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("/");
        int i = 0;
        while (i < stack.size()) {
            stringbuilder.append(stack.get(i++));
            if (i != stack.size()) {
                stringbuilder.append("/");
            }
        }
        return stringbuilder.toString();
    }

}
