import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Equalize_the_Array {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int maxFreq = 1;
        Map<Integer, Integer> map = new HashMap<>();

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
                // update max
                int t = map.get(number);
                maxFreq = maxFreq < t ? maxFreq + 1 : maxFreq;
            } else {
                map.put(number, 1);
            }
        }

        map = null;
        pw.println(N - maxFreq);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}

