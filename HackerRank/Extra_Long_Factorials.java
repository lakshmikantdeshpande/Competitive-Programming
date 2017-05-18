import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Long_Factorials {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= N; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));

        pw.println(factorial);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}