// Day 8
package thirtyDaysOfCode;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries_and_Maps {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Map<String, Integer> map = new HashMap<>();

        int N = scanner.nextInt();
        scanner.nextLine(); // skip the nasty newline character

        while (N-- > 0)
            map.put(scanner.next(), scanner.nextInt());

        while (scanner.hasNext()) {
            String key = scanner.next();
            if (map.containsKey(key))
                pw.println(key + "=" + map.get(key));
            else
                pw.println("Not found");
        }

        map = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}