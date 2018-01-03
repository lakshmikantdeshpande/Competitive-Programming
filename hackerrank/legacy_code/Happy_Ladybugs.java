// N + N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Happy_Ladybugs {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            scanner.nextLine();
            pw.println(areHappy(scanner.nextLine(), N) ? "YES" : "NO");
        }

        pw.close();
        scanner.close();
    }

    private static boolean areHappy(String string, int N) {
        char[] array = new char[26];
        boolean hasUnderscores = false;
        boolean allAreHappy = true;

        for (int i = 0; i < N; i++) {
            if (string.charAt(i) == '_')
                hasUnderscores = true;
            else {
                array[string.charAt(i) - 'A']++; // counter of character
                // if character is same to previous or next character
                if (!((i > 0 && string.charAt(i) == string.charAt(i - 1) || (i < N - 1 && string.charAt(i) == string.charAt(i + 1)))))
                    allAreHappy = false;
            }
        }

        if (allAreHappy)
            return true;
        if (!hasUnderscores)
            return false;

        for (int i = 0; i < 26; i++) {
            if (array[i] == 1)
                return false;
        }
        return true;
    }
}