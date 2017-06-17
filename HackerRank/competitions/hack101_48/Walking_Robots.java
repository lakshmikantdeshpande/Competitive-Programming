package competitions.hack101_48;

import java.io.PrintWriter;
import java.util.Scanner;

class Walking_Robots {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        StringBuilder strb = new StringBuilder();

        while (N-- > 0) {
            strb = new StringBuilder(scanner.next());
            int count = 0;
            for (int i = 0; i < strb.length() - 1; i++)
                if (strb.charAt(i) == 'r' && strb.charAt(i + 1) == 'l') {
                    strb.replace(i, i + 1, "d");
                    strb.replace(i + 1, i + 2, "d");
                    count += 2;
                } else if ((strb.charAt(i) == 'r' && strb.charAt(i + 1) == 'd') || (strb.charAt(i) == 'd' && strb.charAt(i + 1) == 'l')) {
                    strb.replace(i, i + 1, "d");
                    strb.replace(i + 1, i + 2, "d");
                    count++;
                }
            for (int i = 0; i < strb.length() - 1; i++)
                if ((strb.charAt(i) == 'r' && strb.charAt(i + 1) == 'd') || (strb.charAt(i) == 'd' && strb.charAt(i + 1) == 'l')) {
                    strb.replace(i, i + 1, "d");
                    strb.replace(i + 1, i + 2, "d");
                    count++;
                }
            for (int i = 0; i < strb.length() - 1; i++)
                if ((strb.charAt(i) == 'r' && strb.charAt(i + 1) == 'd') || (strb.charAt(i) == 'd' && strb.charAt(i + 1) == 'l')) {
                    strb.replace(i, i + 1, "d");
                    strb.replace(i + 1, i + 2, "d");
                    count++;
                }
            pw.println(count);
        }

        strb = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}