import java.io.PrintWriter;
import java.util.Scanner;

class Viral_Advertising {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();

        int people = 5;
        int liked = 0;
        while (N-- > 0) {
            int temp = (int) Math.floor(people / 2);
            liked += temp;
            people = temp * 3;
        }
        pw.println(liked);

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}