import java.io.PrintWriter;
import java.util.Scanner;

class Utopian_Tree {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int temp;

        while (N-- > 0) {
            temp = 1;
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                if (i % 2 != 0)
                    temp++;
                else
                    temp *= 2;
            }
            pw.println(temp);
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}