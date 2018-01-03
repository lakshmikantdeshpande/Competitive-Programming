// N time N space

import java.io.PrintWriter;
import java.util.Scanner;

class Non_Divisible_Subset {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[k + 1];

        for (int i = 0; i < N; i++) {
            b[a[i] % k]++;
        }

        int p = k % 2 == 0 ? k / 2 : (k / 2) + 1;

        for (int i = 0; i < p; i++) {
            if (b[0] != 0 && i == 0)
                count++;
            else
                count += (b[i] > b[k - i] ? b[i] : b[k - i]);
        }

        if (k % 2 == 0)
            count++;
        pw.println(count);

        pw.close();
        scanner.close();
    }
}