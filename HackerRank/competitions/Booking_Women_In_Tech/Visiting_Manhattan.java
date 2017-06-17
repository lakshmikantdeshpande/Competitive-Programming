package competitions.Booking_Women_In_Tech;

import java.io.PrintWriter;
import java.util.Scanner;

class Visiting_Manhattan {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int L = scanner.nextInt();
        int H = scanner.nextInt();

        int[][] landmarks = new int[L][2];
        int[][] hotels = new int[H][2];

        for (int i = 0; i < L; i++) {
            landmarks[i][0] = scanner.nextInt();
            landmarks[i][1] = scanner.nextInt();
        }

        float min = 99999999;
        int minindex = 0;
        for (int i = 0; i < H; i++) {
            hotels[i][0] = scanner.nextInt();
            hotels[i][1] = scanner.nextInt();
            float p = 0;
            for (int a = 0; a < L; a++)
                p += Math.abs(landmarks[a][0] - hotels[i][0]) + Math.abs(landmarks[a][1] - hotels[i][1]);
            if (p / H < min)
                min = p / H;
            minindex = i;
        }

        pw.print(minindex + 1);
        landmarks = null;
        hotels = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
