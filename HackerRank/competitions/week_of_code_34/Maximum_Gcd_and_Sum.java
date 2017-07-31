package competitions.week_of_code_34;

import java.io.PrintWriter;
import java.util.*;

public class Maximum_Gcd_and_Sum {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp > 1)
                setA.add(temp);
        }

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp > 1)
                setB.add(temp);
        }

        pw.println(sum(setA, setB));
        pw.close();
    }


    public static int gcd(int a, int b) {
        if (a == b)
            return a;
        else if (a < b)
            return gcd(a, b - a);
        else
            return gcd(a - b, b);
    }

    static int sum(Set<Integer> setA, Set<Integer> setB) {
        if (setA.isEmpty() || setB.isEmpty())
            return 1;

        int gcd, max, sum;
        int maxA = Collections.max(setA);
        int maxB = Collections.max(setB);
        max = gcd(maxA, maxB);
        sum = maxA + maxB;

        Iterator<Integer> first, second;
        first = setA.iterator();
        while (first.hasNext()) {
            int a = first.next();
            if (a <= max) {
                first.remove();
                continue;
            } else if (setB.contains(a)) {
                max = a;
                sum = a + a;
                continue;
            }
            second = setB.iterator();
            while (second.hasNext()) {
                int b = second.next();
                if (b <= max) {
                    second.remove();
                    continue;
                }

                gcd = gcd(a, b);
                if (gcd > max) {
                    sum = a + b;
                    max = gcd;
                } else if (sum < (a + b) && gcd == max)
                    sum = a + b;
            }
        }
        return sum;
    }
}