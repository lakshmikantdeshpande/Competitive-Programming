import java.io.PrintWriter;
import java.util.Scanner;

class Compare_The_Triplets {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        short a[] = new short[3], b[] = new short[3];

        for (byte i = 0; i < 6; i++)
            if (i > 2)
                b[i - 3] = scanner.nextByte();
            else
                a[i] = scanner.nextByte();

        short x = 0;
        short y = 0;

        for (byte i = 0; i < 3; i++)
            if (a[i] > b[i])
                x++;
            else if (a[i] < b[i])
                y++;

        pw.println(x + " " + y);

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        a = null;
        b = null;
        System.gc();
    }
}