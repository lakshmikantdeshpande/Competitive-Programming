import java.io.PrintWriter;
import java.util.Scanner;

class Strings_Making_Anagrams {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] array = new int[26];
        int counter = 0;
        for (char c : scanner.nextLine().toCharArray())
            array[c - 'a']++;

        for (char c : scanner.nextLine().toCharArray())
            array[c - 'a']--;

        for (int i = 0; i < 26; i++)
            counter += Math.abs(array[i]);

        pw.println(counter);

        pw.close();
        scanner.close();
    }
}