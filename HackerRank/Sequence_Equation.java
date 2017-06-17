// simple array jumps
// N + N + N time
// N space

import java.io.PrintWriter;
import java.util.Scanner;

class Sequence_Equation {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt() + 1;
        int[] array = new int[N];
        int[] answer = new int[N];

        for (int i = 1; i < N; i++)
            array[i] = scanner.nextInt();
        for (int i = 1; i < N; i++)
            answer[array[array[i]]] = i;
        for (int i = 1; i < N; i++)
            pw.println(answer[i]);

        array = answer = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
