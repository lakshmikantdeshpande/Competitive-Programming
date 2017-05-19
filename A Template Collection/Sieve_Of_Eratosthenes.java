// O (N * logN * log(log(N))
// space N

import java.util.Arrays;

public class Sieve_Of_Eratosthenes {
    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;  // duh !
        primes[1] = false;  // duh !

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(primes[i] ? i + " " : "");
        }
    }

    public static void main(String[] args) {
        sieveOfEratosthenes(30);
    }
}
