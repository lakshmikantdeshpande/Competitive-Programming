// INCOMPLETE CODE

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class PRIME1 {
    private static List<Integer> simplesieve(int limit) {
        boolean primes[] = new boolean[limit + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (primes[i]) {
                for (int j = i * 2; j <= limit; j += i)
                    primes[j] = false;
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= limit; i++) {
            if (primes[i])
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            List<Integer> list = simplesieve(n);
        }
        scanner.close();
        pw.close();
    }
}