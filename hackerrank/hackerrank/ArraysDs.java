package hackerrank;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class ArraysDs {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            stack.push(scanner.nextInt());
        }
        scanner.close();

        PrintWriter printWriter = new PrintWriter(System.out);
        while (!stack.isEmpty()) {
            printWriter.print(stack.pop() + " ");
        }
        printWriter.close();
    }

}