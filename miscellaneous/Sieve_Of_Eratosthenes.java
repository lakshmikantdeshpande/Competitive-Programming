package miscellaneous;// O (N * logN * log(log(N))
// space N

import java.util.Arrays;

class Sieve_Of_Eratosthenes {
    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;  // duh !
        primes[1] = false;  // duh !

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 2; i <= squareRoot; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(primes[i] ? i + " " : "");
        }
    }

    public static void main(String[] args) {
        sieveOfEratosthenes(14);
    }
}
