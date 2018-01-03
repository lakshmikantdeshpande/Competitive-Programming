import java.io.PrintWriter;
import java.util.Scanner;

public class The_Love_Letter_Mystery {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            pw.println(solve(scanner.nextLine()));
        }

        pw.close();
        scanner.close();
    }

    private static int solve(String string) {
        int result = 0;
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            result += Math.abs(string.charAt(i) - string.charAt(j));
            i++;
            j--;
        }
        return result;
    }
}
