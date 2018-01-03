import java.io.PrintWriter;
import java.util.Scanner;

class Designer_PDF_Viewer {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] array = new int[26];

        for (int i = 0; i < 26; i++)
            array[i] = scanner.nextInt();
        scanner.nextLine();

        int max = Integer.MIN_VALUE;
        String string = scanner.next();
        for (char c : string.toCharArray())
            max = max < array[c - 'a'] ? array[c - 'a'] : max;

        array = null;
        pw.println(max * string.length());
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}