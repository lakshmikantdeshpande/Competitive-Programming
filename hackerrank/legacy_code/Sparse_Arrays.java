// 1 time N space

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sparse_Arrays {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Map<String, Integer> map = new HashMap<>();
        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            String temp = scanner.nextLine().trim();
            map.put(temp, map.containsKey(temp) ? map.get(temp) + 1 : 1);
        }
        int Q = scanner.nextInt();
        scanner.nextLine();
        while (Q-- > 0) {
            String temp = scanner.nextLine().trim();
            pw.println(map.getOrDefault(temp, 0));
        }

        pw.close();
        scanner.close();
    }
}
