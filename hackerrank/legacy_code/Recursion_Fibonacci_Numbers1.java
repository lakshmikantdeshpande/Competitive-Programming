// 2^N time complexity N space complexity

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Recursion_Fibonacci_Numbers1 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(br.readLine());
        pw.println(fibonacci(N));

        pw.close();
        br.close();
    }

    private static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
