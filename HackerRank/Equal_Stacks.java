import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Equal_Stacks {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int s1 = scanner.nextInt(), s2 = scanner.nextInt(), s3 = scanner.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int top1 = 0, top2 = 0, top3 = 0;

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        while (s1-- > 0) {
            int temp = scanner.nextInt();
            sum1 += temp;
            stack1.push(temp);
        }
        while (s2-- > 0) {
            int temp = scanner.nextInt();
            sum2 += temp;
            stack2.push(temp);
        }
        while (s3-- > 0) {
            int temp = scanner.nextInt();
            sum3 += temp;
            stack3.push(temp);
        }

        while (true) {

            if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
                pw.println(0);
                break;
            }

            if (sum1 == sum2 && sum2 == sum3) {
                pw.println(sum1);
                break;
            }

            if (sum1 >= sum2 && sum1 >= sum3)
                sum1 -= stack1.get(top1++);
            else if (sum2 >= sum1 && sum2 >= sum3)
                sum2 -= stack2.get(top2++);
            else if (sum3 >= sum1 && sum3 >= sum2)
                sum3 -= stack3.get(top3++);
        }

        pw.close();
        stack1 = stack2 = stack3 = null;
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}