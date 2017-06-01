import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangle {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        int[] array = new int[N];
        int maxrect = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int i = 0;
        while (i < N) {
            if (stack.isEmpty() || array[i] >= array[stack.peek()])
                stack.push(i++);
            else {
                int top = stack.pop();
                maxrect = Math.max(maxrect, array[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            maxrect = Math.max(maxrect, array[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        }

        pw.println(maxrect);
        pw.close();
        scanner.close();
    }
}
