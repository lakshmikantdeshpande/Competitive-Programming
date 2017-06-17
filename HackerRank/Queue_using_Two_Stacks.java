import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

class Queue_using_Two_Stacks {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<Long> stackA = new Stack<>();
        Stack<Long> stackB = new Stack<>();

        int N = scanner.nextInt();
        while (N-- > 0) {
            switch (scanner.nextInt()) {
                case 1:
                    stackA.push(scanner.nextLong());
                    break;
                case 2:
                    if (stackB.isEmpty()) {
                        while (!stackA.isEmpty())
                            stackB.push(stackA.pop());
                    }
                    stackB.pop();
                    break;
                case 3:
                    if (stackB.isEmpty()) {
                        while (!stackA.isEmpty())
                            stackB.push(stackA.pop());
                    }
                    pw.println(stackB.peek());
                    break;
            }
        }

        stackA = stackB = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}

