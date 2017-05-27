// N + N time N space

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Happy_Ladybugs {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- > 0) {
            scanner.nextLine();
            String string = scanner.nextLine();

            Map<Character, Integer> map = new HashMap<>();
            boolean flag = true;

            if (string.contains("_")) {
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
                    map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
                }
                map.remove('_');        // no need to have underscores in the map

                for (int value : map.values()) {
                    if (value == 1) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = string.matches("((\\w)(\\2+))+");
            }
            pw.println(flag ? "YES" : "NO");
        }

        pw.close();
        scanner.close();
    }
}