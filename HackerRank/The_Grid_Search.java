// n * n time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

public class The_Grid_Search {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int bWidth = scanner.nextInt();
            int bHeight = scanner.nextInt();
            scanner.nextLine();
            char[][] bigArray = new char[bWidth][bHeight];

            for (int i = 0; i < bWidth; i++) {
                bigArray[i] = scanner.nextLine().toCharArray();
            }

            int sWidth = scanner.nextInt();
            int sHeight = scanner.nextInt();
            scanner.nextLine();

            char[][] smallArray = new char[sWidth][sHeight];

            for (int i = 0; i < sWidth; i++) {
                smallArray[i] = scanner.nextLine().toCharArray();
            }

            if (sWidth > bWidth || sHeight > bHeight) {
                pw.println("NO");
            } else {
                int diffWidth = bWidth - sWidth;
                int diffHeight = bHeight - sHeight;
                boolean flag = false;

                for (int i = 0; i < diffWidth + 1; i++) {
                    for (int j = 0; j < diffHeight + 1; j++) {
                        if (bigArray[i][j] == smallArray[0][0]) {
                            if (rectangleFound(bigArray, smallArray, i, j, sHeight, sWidth)) {
                                pw.println("YES");
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag)
                        break;
                }
                if (!flag)
                    pw.println("NO");
            }
        }

        pw.close();
        scanner.close();
    }

    // bigger array, smaller array, original i, original j, smaller array height and width
    private static boolean rectangleFound(char[][] bigArray, char[][] smallArray, int oi, int oj, int sHeight, int sWidth) {
        for (int i = oi; i < oi + sWidth; i++) {
            boolean flag = false;
            for (int j = oj; j < oj + sHeight; j++) {
                if (bigArray[i][j] != smallArray[i - oi][j - oj]) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                return false;
        }
        return true;
    }
}
