// Nasty code
// will improve today

import java.io.PrintWriter;
import java.util.Scanner;

class Fair_Rations {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int loaves = 0;

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        if (N == 2) {
            if ((isEven(array[0]) && !isEven(array[1])) || (!isEven(array[0]) && isEven(array[1]))) {
                pw.println("NO");
                pw.close();
                return;
            } else if ((isEven(array[0])) && (isEven(array[1])))
                pw.println(0);
            else
                pw.println(1);
        } else {
            for (int i = 0; i < N - 1; i++) {
                if (i == 0 && !isEven(array[i])) {
                    array[i]++;
                    array[i + 1]++;
                    loaves += 2;
                } else if (i == N - 1 && ((!isEven(i) && isEven(i + 1)) || (isEven(i) && !isEven(i + 1)))) {
                    pw.println("NO");
                    pw.close();
                    return;
                } else if ((!isEven(array[i]) && isEven(array[i + 1])) || (!isEven(array[i]) && !isEven(array[i + 1]))) {
                    array[i]++;
                    array[i + 1]++;
                    loaves += 2;
                }
            }
        }
        pw.println(verify(array) ? loaves : "NO");
        pw.close();
        scanner.close();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean verify(int[] array) {
        for (int i : array)
            if (!isEven(i))
                return false;
        return true;
    }

}
