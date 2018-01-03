// N time N space

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

class Poisonous_Plants {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int i = array.length - 1;
        boolean day1 = false;

        int min = 0, max = 0, days = 0;
        while (i >= 0) {
            // find the rightmost index for removal
            while (i > 0 && array[i] > array[i - 1]) {
                i--;
                day1 = true;
            }

            while (!stack.isEmpty() && array[i] < stack.peek()) {
                max = Math.max(max, stack.size());
                stack.pop();
            }

            min = Math.max(stack.size(), 0);
            days = Math.max(days, max - min);
            // push the new rightmost index
            stack.push(array[i--]);
        }

        pw.println(days + (day1 ? 1 : 0));

        pw.close();
        scanner.close();
    }
}