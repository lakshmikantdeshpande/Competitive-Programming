import java.io.PrintWriter;
import java.util.Scanner;

class The_Time_in_Words {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M == 0) {
            pw.println(getHours(H) + " o' clock");
        } else if (M == 1 || M == 59) {
            pw.println("one minute " + (M == 1 ? "past " + getHours(H) : "to " + getHours((H + 1) % 12)));
        } else if (M == 30) {
            pw.println("half past " + getHours(H));
        } else if (M == 45 || M == 15) {
            pw.println("quarter " + (M == 15 ? "past " + getHours(H) : "to " + getHours((H + 1) % 12)));
        } else {
            if (M == 20)
                pw.println("twenty minutes past " + getHours(H));
            else if (M > 30)
                pw.println(getMinutes(60 - M) + " to " + getHours((H + 1) % 12));
            else
                pw.println(getMinutes(M) + " past " + getHours(H));
        }

        pw.close();
        scanner.close();
    }

    private static String getHours(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
        }
        return "";
    }

    private static String getMinutes(int number) {
        switch (number) {
            case 0:
                return "o' clock";
            case 1:
                return "one minute";
            case 2:
                return "two minutes";
            case 3:
                return "three minutes";
            case 4:
                return "four minutes";
            case 5:
                return "five minutes";
            case 6:
                return "six minutes";
            case 7:
                return "seven minutes";
            case 8:
                return "eight minutes";
            case 9:
                return "nine minutes";
            case 10:
                return "ten minutes";
            case 11:
                return "eleven minutes";
            case 12:
                return "twelve minutes";
            case 13:
                return "thirteen minutes";
            case 14:
                return "fourteen minutes";
            case 15:
                return "fifteen minutes";
            case 16:
                return "sixteen minutes";
            case 17:
                return "seventeen minutes";
            case 18:
                return "eighteen minutes";
            case 19:
                return "nineteen minutes";
            case 20:
                return "twenty";
        }
        return getMinutes(number - number % 10) + " " + getMinutes(number % 10);
    }
}