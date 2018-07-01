import java.io.PrintWriter;
import java.util.Scanner;

class Bitwise_AND {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int max = scanner.nextInt();

            int currMax = 0;
            for (int i = 1; i <= N; i++) {
                boolean flag = false;
                for (int j = i + 1; j <= N; j++) {
                    int t = i & j;
                    if (t == max - 1) {
                        currMax = t;
                        flag = true;
                        break;
                    } else if (t > currMax && t < max)
                        currMax = t;
                }
                if (flag)
                    break;
            }
            pw.println(currMax);
        }

        pw.close();
        scanner.close();
    }
}