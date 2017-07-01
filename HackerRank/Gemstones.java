// N time N space

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[26];

        for (int i = 0; i < N; i++) {
            Set<Character> set = new HashSet<>();
            for (char c : scanner.nextLine().toCharArray())
                set.add(c);
            for (char c : set)
                ++array[c - 97];
        }

        int counter = 0;
        for (int i = 0; i < 26; i++) {
            if (array[i] == N)
                ++counter;
        }

        pw.println(counter);
        pw.close();
        scanner.close();
    }
}
