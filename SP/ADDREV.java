import java.io.PrintWriter;
import java.util.Scanner;

public class ADDREV {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        while (N-- > 0) {
            int numA = reverse(scanner.nextInt());
            int numB = reverse(scanner.nextInt());
            pw.println(reverse(numA + numB));
        }

        pw.close();
        scanner.close();
    }

    public static int reverse(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum * 10 + number % 10;
            number /= 10;
        }
        return sum;
    }
}
