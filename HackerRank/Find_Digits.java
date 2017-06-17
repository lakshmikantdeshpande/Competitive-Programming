// simple modulo operation
// rules : (a + b) % N = (a%N + b%N)%N  same for *

import java.io.PrintWriter;
import java.util.Scanner;

class Find_Digits {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            long N = scanner.nextLong();
            long counter = 0;
            long temp = N;
            while (temp > 0) {
                long t = temp % 10;
                counter = t != 0 && N % t == 0 ? counter + 1 : counter;
                temp = temp / 10;
            }
            pw.println(counter);
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}