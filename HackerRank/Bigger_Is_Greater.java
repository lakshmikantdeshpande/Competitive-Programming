import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Bigger_Is_Greater {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            char array[] = scanner.nextLine().toCharArray();
            int i = array.length - 1;
            while (i > 0 && array[i - 1] >= array[i])
                i--;

            if (i <= 0) {
                pw.println("no answer");
                continue;
            }

            int j = array.length - 1;
            while (array[j] <= array[i - 1])
                j--;

            char temp = array[i - 1];
            array[i - 1] = array[j];
            array[j] = temp;

            Arrays.sort(array, i, array.length);

            for (int a : array)
                pw.print(a);
            pw.println();
        }

        pw.close();
        scanner.close();
    }
}
