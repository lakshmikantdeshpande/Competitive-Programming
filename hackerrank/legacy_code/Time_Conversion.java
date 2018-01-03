import java.io.PrintWriter;
import java.util.Scanner;

class Time_Conversion {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String time = scanner.next();

        pw.println(timeConversion(time));
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    private static String timeConversion(String time) throws Exception {
        if (time == null || time.isEmpty())
            throw new Exception("Wrong input");

        // am = true pm = false
        boolean am = time.substring(time.length() - 2).equals("PM") ? false : true;

        int hr = Integer.parseInt(time.substring(0, 2));
        StringBuilder strb = new StringBuilder();
        if (am)
            strb.append(hr == 12 ? "00" : ("0" + hr));
        else
            strb.append(hr == 12 ? hr : hr + 12);

        return strb.append(time.substring(2, 8)).toString();
    }

}