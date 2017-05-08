import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangle {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int maxrect = 1;
        int temprec = 1;

        while (N-- > 0) {
            int temp = scanner.nextInt();
            if (stack.isEmpty()) {
                min = temp;
                stack.push(temp);
            } else {
                if (temp >= min) {
                    stack.push(temp);
                    temprec++;
                    if (temprec * min > maxrect) {
                        maxrect = min * temprec;
                        System.out.println("MIN" + min + " TEMP " + temprec);
                    }
                } else {
                    stack.clear();
                    temprec = 1;
                    min = temp;
                    stack.push(temp);
                }
            }
        }
        pw.println(maxrect);
        stack = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
