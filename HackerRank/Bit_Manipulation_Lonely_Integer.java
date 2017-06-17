// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Bit_Manipulation_Lonely_Integer {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int temp = 0;

        while (N-- > 0)
            temp = temp ^ scanner.nextInt();
        pw.println(temp);

        pw.close();
        scanner.close();
    }
}