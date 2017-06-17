package competitions.week_of_code_32;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Fight_the_Monsters {

    static private int getMaxMonsters(int n, int hitPower, int maxhits, int[] h) {
        int i = 0;
        int count = 0;
        while (maxhits > 0 && i < n) {
            int time = (int) Math.ceil((double) h[i] / hitPower);
            maxhits -= time;
            if (maxhits < 0)
                break;
            i++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int hitPower = scanner.nextInt();
        int maxhits = scanner.nextInt();
        int[] hits = new int[N];
        for (int i = 0; i < N; i++) {
            hits[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(hits);

        pw.println(getMaxMonsters(N, hitPower, maxhits, hits));
        pw.close();
        scanner.close();
    }
}