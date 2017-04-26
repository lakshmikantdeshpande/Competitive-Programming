import java.io.PrintWriter;
import java.util.Scanner;

public class Non_Divisible_Subset {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int k = 1 + (scanner.nextInt() / 2);
        int counter = 0;

        while (N-- > 0) {
            long temp = scanner.nextLong();
            if (temp < k)
                counter++;
        }

        pw.println(counter);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}