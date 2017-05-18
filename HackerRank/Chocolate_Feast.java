import java.io.PrintWriter;
import java.util.Scanner;

public class Chocolate_Feast {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int money = scanner.nextInt();
            int price = scanner.nextInt();
            int wrappers = scanner.nextInt();

            int chocolates = money / price;
            int wrapperchox = chocolates;

            while (wrapperchox >= wrappers) {
                int temp = wrapperchox / wrappers;
                wrapperchox = wrapperchox % wrappers + temp;
                chocolates += temp;
            }
            pw.println(chocolates);
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
