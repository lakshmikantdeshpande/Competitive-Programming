import java.io.PrintWriter;
import java.util.Scanner;

public class Game_of_Two_Stacks {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long sum = scanner.nextLong();
            int[] arrayA = new int[a];
            int[] arrayB = new int[b];

            long temp = 0;
            int counter = 0;

            for (int i = 0; i < a; i++)
                arrayA[i] = scanner.nextInt();
            for (int i = 0; i < b; i++)
                arrayB[i] = scanner.nextInt();

            int p = 0, q = 0;
            while (!(p == arrayA.length && q == arrayB.length) && temp < sum) {

                if (p != arrayA.length && q != arrayB.length) {
                    if (arrayA[p] > arrayB[q] && p + 1 < arrayA.length && arrayA[p + 1] < arrayB[q]) {
                        temp += arrayA[p++];
                        counter++;
                    } else if (arrayA[p] < arrayB[q] && q + 1 < arrayB.length && arrayA[p] > arrayB[q + 1]) {
                        temp += arrayB[q++];
                        counter++;
                    } else {

                        int min = Math.min(arrayA[p], arrayB[q]);
                        if ((temp + min) <= sum) {
                            temp += min;
                            counter++;
                        } else break;
                        if (arrayA[p] == min) p++;
                        else q++;
                    }
                } else if (p == arrayA.length) {
                    if ((temp + arrayB[q]) <= sum) {
                        temp += arrayB[q++];
                        counter++;
                    } else break;
                } else {
                    if ((temp + arrayA[p]) <= sum) {
                        temp += arrayA[p++];
                        counter++;
                    } else break;
                }
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