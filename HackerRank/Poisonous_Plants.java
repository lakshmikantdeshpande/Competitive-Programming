// N time N space

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

class Poisonous_Plants {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        Stack<Long> stack = new Stack<>();
        Stack<Long> tempStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            stack.push(scanner.nextLong());
        }

        if (N == 1)
            pw.println(0);
        else {
            boolean isFinished = false;
            int counter = 0;

            while (!isFinished) {
                boolean plantDied = false;
                while (!stack.isEmpty()) {
                    long temp = stack.pop();
                    //  if any plant has more pesticide than the plant at its left, it will die
                    // otherwise we will push it to temp stack
                    if (stack.isEmpty() || stack.peek() >= temp)
                        tempStack.push(temp);
                    else
                        plantDied = true;
                }

                // transfer stronger plants to tempStack
                while (!tempStack.isEmpty())
                    stack.push(tempStack.pop());

                // if no plants die, dying will be finished (isFinished = true)
                if (!plantDied)
                    isFinished = true;
                else
                    counter++;
            }
            pw.println(counter);
        }

        pw.close();
        scanner.close();
    }
}
