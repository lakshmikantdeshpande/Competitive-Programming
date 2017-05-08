import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Mini_Max_Sum {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long[] array = new long[5];

        for (int i = 0; i < 5; i++)
            array[i] = scanner.nextLong();

        Arrays.sort(array);
        pw.println(array[0] + array[1] + array[2] + array[3] + " " + (array[1] + array[2] + array[3] + array[4]));
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}