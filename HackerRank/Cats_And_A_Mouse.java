import java.io.PrintWriter;
import java.util.Scanner;

public class Cats_And_A_Mouse {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();

        while (N-- > 0) {
            int catA = scanner.nextInt();
            int catB = scanner.nextInt();
            int mouseC = scanner.nextInt();

            if (Math.abs(catA - mouseC) == Math.abs(catB - mouseC))
                pw.println("Mouse C");
            else if (Math.abs(catA - mouseC) > Math.abs(catB - mouseC))
                pw.println("Cat B");
            else
                pw.println("Cat A");
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}