import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Luck_Balance {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int min = scanner.nextInt();
        int sum = 0;

        Queue<Integer> important = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int luck = scanner.nextInt();
            int importance = scanner.nextInt();
            sum += luck;
            if (importance == 1) {
                important.add(luck);
            }
        }

        while (important.size() > min) {
            sum -= 2 * important.poll();
        }

        pw.println(sum);

        pw.close();
        scanner.close();
    }
}
