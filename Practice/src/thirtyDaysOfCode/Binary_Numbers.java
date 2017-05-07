// Day 10
package thirtyDaysOfCode;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Binary_Numbers {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (N > 0) {
            stack.push(N % 2);
            N /= 2;
        }
        int max = Integer.MIN_VALUE;
        int counter = 1;
        int first = stack.pop();
        while (!stack.isEmpty()) {
            if (first == 1 && stack.peek() == 1) {
                counter++;
                first = stack.pop();
            } else {
                counter = 1;
                first = stack.pop();
            }
            max = counter > max ? counter : max;
        }

        pw.println(max);
        stack = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}