// N time complexity N space complexity

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Recursion_Fibonacci_Numbers2 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(br.readLine());
        pw.println(fibonacci(N));

        pw.close();
        br.close();
    }

    private static int fibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}