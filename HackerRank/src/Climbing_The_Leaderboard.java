// important program to learn Binary Search

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Climbing_The_Leaderboard {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        List<Long> scores = new ArrayList<>();
        int people = scanner.nextInt();
        long last = scanner.nextLong();
        scores.add(last);
        for (int i = 1; i < people; i++) {
            long temp = scanner.nextLong();
            if (temp != last) {
                scores.add(temp);
                last = temp;
            }
        }

        int alice = scanner.nextInt();
        for (int i = 0; i < alice; i++) {
            long aliceScore = scanner.nextLong();
            pw.println(nextBiggerElement(aliceScore, scores) + 1);  // +1 because of index starting from 1
        }
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }

    private static int nextBiggerElement(long num, List<Long> list) {
        if (num > list.get(0))
            return 0;
        else if (num < list.get(list.size() - 1))
            return list.size();

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) == num)
                return mid;
            else if (list.get(mid) > num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
