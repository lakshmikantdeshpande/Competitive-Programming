// N time complexity 1 space complexity

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Recursion_Fibonacci_Numbers3 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(br.readLine());
        pw.println(fibonacci(N));

        pw.close();
        br.close();
    }

    private static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}