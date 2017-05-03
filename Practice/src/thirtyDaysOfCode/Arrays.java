// Day 7
package thirtyDaysOfCode;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Arrays {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        while (N-- > 0)
            stack.push(scanner.nextInt());
        while (!stack.isEmpty())
            pw.print(stack.pop() + " ");

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
