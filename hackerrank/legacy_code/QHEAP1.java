import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QHEAP1 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Queue<Long> queue = new PriorityQueue<>();

        int N = scanner.nextInt();
        while (N-- > 0) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    queue.add(scanner.nextLong());
                    break;
                case 2:
                    queue.remove(scanner.nextLong());
                    break;
                case 3:
                    pw.println(queue.peek());
                    break;
            }
        }

        pw.close();
        scanner.close();
    }

}
