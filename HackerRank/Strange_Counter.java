import java.io.PrintWriter;
import java.util.Scanner;

public class Strange_Counter {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long N = scanner.nextLong();
        long time = 0;
        long multiple = 3;

        while (time < N) {
            time += multiple;
            multiple *= 2;
        }
        pw.println(time - N + 1);

        pw.close();
        scanner.close();
    }
}