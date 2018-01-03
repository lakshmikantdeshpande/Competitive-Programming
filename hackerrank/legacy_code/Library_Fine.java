import java.io.PrintWriter;
import java.util.Scanner;

class Library_Fine {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        if (actualYear < expectedYear || ((actualYear == expectedYear) && (actualMonth < expectedMonth))
                || ((actualYear == expectedYear) && (actualMonth == expectedMonth) && (actualDay <= expectedDay)))
            pw.println(0);
        else {
            int fine = 0;

            if (actualYear > expectedYear)
                fine += 10000;
            else if (actualMonth > expectedMonth)
                fine += 500 * (actualMonth - expectedMonth);
            else
                fine += (actualDay - expectedDay) * 15;
            pw.println(fine);
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}