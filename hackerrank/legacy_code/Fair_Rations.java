// N time

import java.io.PrintWriter;
import java.util.Scanner;

class Fair_Rations {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int loaves = 0;

        for (int i = 0; i < N - 1; i++) {
            if (!isEven(array[i])) {      // if it is an odd number
                array[i]++;
                array[i + 1]++;
                loaves += 2;
            }
        }

        if (!isEven(array[N - 1]))
            pw.println("NO");   // if last number is odd, print NO
        else
            pw.println(loaves);

        pw.close();
        scanner.close();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
