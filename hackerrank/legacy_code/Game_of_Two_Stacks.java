// N + N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Game_of_Two_Stacks {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long sum = scanner.nextLong();

            int[] arrayA = new int[a + 1];
            int[] arrayB = new int[b + 1];

            for (int i = 1; i <= a; i++) {
                arrayA[i] = scanner.nextInt();
                arrayA[i] += arrayA[i - 1];
            }

            for (int i = 1; i <= b; i++) {
                arrayB[i] = scanner.nextInt();
                arrayB[i] += arrayB[i - 1];
            }

            int i;
            for (i = 1; i <= a; i++) {
                if (arrayA[i] > sum)
                    break;
            }

            int count = --i;
            for (int j = 1; j <= b; ) {
                int temp = arrayA[i] + arrayB[j];

                if (temp > sum && i > 0) {
                    i--;
                } else {
                    if (temp > sum && i == 0)
                        break;

                    if (temp <= sum)
                        count = Math.max(count, i + j);
                    j++;
                }
            }

            pw.println(count);
        }

        pw.close();
        scanner.close();
    }
}