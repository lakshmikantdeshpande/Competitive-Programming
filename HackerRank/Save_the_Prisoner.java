import java.io.PrintWriter;
import java.util.Scanner;

class Save_the_Prisoner {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            long prisoners = scanner.nextLong();
            long sweets = scanner.nextLong();
            long start = scanner.nextLong();
            pw.println(((sweets + start - 1) % prisoners) == 0 ? prisoners : ((sweets + start - 1) % prisoners));
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}