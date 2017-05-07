package competitions.booking_women_in_tech;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Highlight_Landmarks {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder stringBuilder = new StringBuilder();

        Set<String> set = new HashSet<>();
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
        int N = scanner.nextInt();
        while (N-- > 0)
            set.add(scanner.next());

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (set.contains(token)) {
                stringBuilder.append("<b>");
                stringBuilder.append(token);
                if (stringTokenizer.hasMoreTokens())
                    stringBuilder.append("</b> ");
                else
                    stringBuilder.append("</b>");
            } else {
                if (stringTokenizer.hasMoreTokens())
                    stringBuilder.append(token + " ");
                else
                    stringBuilder.append(token);
            }
        }

        pw.println(stringBuilder.toString());
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
