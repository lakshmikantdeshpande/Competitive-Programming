package competitions.World_Codesprint_10;

import java.io.PrintWriter;
import java.util.Scanner;

public class Reward_Points {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int output = 0;

        for (int i = 0; i < 3; i++) {
            int temp = scanner.nextInt();
            if (temp > 10)
                output += 100;
            else
                output += temp * 10;
        }

        pw.println(output);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
