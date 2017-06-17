import java.io.PrintWriter;
import java.util.Scanner;

class Electronics_Shop {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int money = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int[] keyboards = new int[k];
        int[] mouses = new int[m];

        for (int i = 0; i < k; i++)
            keyboards[i] = scanner.nextInt();

        for (int i = 0; i < m; i++)
            mouses[i] = scanner.nextInt();

        int last = -1;
        boolean flag = false;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                if (keyboards[i] + mouses[j] > last && keyboards[i] + mouses[j] <= money) {
                    last = keyboards[i] + mouses[j];
                    if (last == money) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                break;
        }

        pw.println(last);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}