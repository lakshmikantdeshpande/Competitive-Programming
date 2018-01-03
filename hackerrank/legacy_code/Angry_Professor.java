import java.io.PrintWriter;
import java.util.Scanner;

class Angry_Professor {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int students = scanner.nextInt();
            int threshold = scanner.nextInt();
            int counter = 0;
            while (students-- > 0)
                if (scanner.nextInt() <= 0)
                    counter++;
            pw.println(counter >= threshold ? "NO" : "YES");
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}