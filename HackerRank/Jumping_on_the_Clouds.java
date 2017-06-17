import java.io.PrintWriter;
import java.util.Scanner;

class Jumping_on_the_Clouds {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int jumps = -1;
        int[] array = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            if (i < (N - 2) && array[i + 2] == 0)
                i++;
            jumps++;
        }

        pw.println(jumps);
        pw.close();
        pw = null;
        array = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}