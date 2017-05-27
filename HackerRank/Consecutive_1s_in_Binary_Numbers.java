// N time N space

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

class Consecutive_1s_in_Binary_Numbers {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        pw.println(toBinary(N));

        pw.close();
        scanner.close();
    }

    private static int toBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        int max = 0;
        int tempmax = 0;
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            if (temp == 1)
                tempmax++;
            else {
                max = Math.max(max, tempmax);
                tempmax = 0;
            }
        }
        return Math.max(max, tempmax);
    }
}