import java.io.PrintWriter;
import java.util.Scanner;

public class Beautiful_Days_at_the_Movies {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        long k = scanner.nextLong();
        int count = 0;

        for (; i <= j; i++)
            if (Math.abs(i - reverse(i)) % k == 0)
                count++;

        pw.println(count);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = (reverse * 10) + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}