// N + N time N space

package competitions.week_of_code_33;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Pattern_Count {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            int counter = 0;
            char[] array = scanner.nextLine().toCharArray();
            int len = array.length;

            for (int i = 0; i < len; i++) {
                if (array[i] == '1') {
                    int t = 0;
                    while (++i < len && array[i] == '0') {
                        ++t;
                    }
                    // array is in bounds, there are more than 1 zeroes, and sequence ends with 1
                    if (i < len && t > 0 && array[i] == '1') {
                        counter++;
                        --i;
                    }
                }
            }

            pw.println(counter);
        }

        pw.close();
        scanner.close();
    }

    private void alternative() {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            int counter = 0;
            int start = 0;
            Matcher matcher = Pattern.compile("1(0+)1").matcher(scanner.nextLine());
            while (matcher.find(start)) {
                counter++;
                start = matcher.start() + 1;
            }
            pw.println(counter);
        }

        pw.close();
        scanner.close();
    }

}