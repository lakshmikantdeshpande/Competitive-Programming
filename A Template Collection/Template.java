import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

class Template {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();

        pw.close();
        scanner.close();
    }
}

class FastsTemplate {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());

        pw.close();
        br.close();
    }
}