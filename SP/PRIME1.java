import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class PRIME1 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        while (N-- > 0) {
            sieveOfEratosthenes(scanner.nextInt(), scanner.nextInt(), pw);
        }

        pw.close();
        scanner.close();
    }

    private static void sieveOfEratosthenes(int low, int high, PrintWriter pw) {
        boolean[] primes = new boolean[high + 1];
        primes[0] = primes[1] = true;

        for (int i = 2; i * i <= high; i++) {
            if (!primes[i]) {
                if (i >= low)
                    pw.println(i);

                for (int j = 2 * i; j <= high; j += i) {
                    primes[j] = true;
                }
            }
        }

        pw.println();
    }
}
