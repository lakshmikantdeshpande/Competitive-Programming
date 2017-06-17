import java.io.PrintWriter;
import java.util.Scanner;

class Taum_and_Bday {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            long black = scanner.nextLong();
            long white = scanner.nextLong();

            long blackPrice = scanner.nextLong();
            long whitePrice = scanner.nextLong();
            long conversionPrice = scanner.nextLong();

            long price = black * blackPrice + white * whitePrice;

            if (blackPrice == whitePrice) {
                pw.println(price);
            } else {
                // white = true, false = black
                long tempPrice;

                if (blackPrice > whitePrice) {
                    tempPrice = black * (whitePrice + conversionPrice) + white * whitePrice;
                } else {
                    tempPrice = black * blackPrice + white * (blackPrice + conversionPrice);
                }
                pw.println(Math.min(tempPrice, price));
            }
        }

        pw.close();
        scanner.close();
    }
}