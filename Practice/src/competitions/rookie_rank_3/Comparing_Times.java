package competitions.rookie_rank_3;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Comparing_Times {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();

        Calendar A = Calendar.getInstance();
        Calendar B = Calendar.getInstance();

        while (N-- > 0) {
            String[] times = scanner.nextLine().split(" ");
            A = setTime(A, times[0]);
            B = setTime(B, times[1]);
            if (A.before(B))
                pw.println("First");
            else
                pw.println("Second");
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    public static Calendar setTime(Calendar calendar, String time) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("hh:mma");
        Date date = df.parse(time);
        calendar.setTime(date);
        return calendar;
    }
}