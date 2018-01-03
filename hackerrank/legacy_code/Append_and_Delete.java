import java.io.PrintWriter;
import java.util.Scanner;

class Append_and_Delete {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        final String yes = "Yes";
        final String no = "No";
        String source = scanner.nextLine();
        String destination = scanner.nextLine();
        int k = scanner.nextInt();
        int i = 0, difference = 0;

        while (i < source.length() && i < destination.length() && source.charAt(i) == destination.charAt(i))
            i++;
        difference = source.length() + destination.length() - i * 2;  // as 2*i characters are covered
        if ((difference <= k && difference % 2 == k % 2) || source.length() + destination.length() < k)
            pw.println(yes);
        else
            pw.println(no);

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}