import java.io.PrintWriter;
import java.util.Scanner;

public class Day_of_the_Programmer {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int year = scanner.nextInt();

        if (year == 1918) {
            pw.println("26.09." + year);
        } else if (year < 1918) {
            if (year % 4 == 0)
                pw.println("12.09." + year);
            else
                pw.println("13.09." + year);
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            pw.println("12.09." + year);
        else
            pw.println("13.09." + year);

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}