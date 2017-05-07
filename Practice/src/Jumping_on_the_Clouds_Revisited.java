import java.io.PrintWriter;
import java.util.Scanner;

public class Jumping_on_the_Clouds_Revisited {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int energy = 100;

        int[] array = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = scanner.nextInt();

        int p = 0;
        do {
            if (array[p] == 0)
                energy--;
            else
                energy -= 3;

            p = (p + K) % N;
        } while (p != 0);

        pw.println(energy);

        array = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}