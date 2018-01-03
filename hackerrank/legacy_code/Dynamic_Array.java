// N time N space

import java.io.PrintWriter;
import java.util.*;

public class Dynamic_Array {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int lastAnswer = 0;

        while (Q-- > 0) {
            int choice = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int index = (x ^ lastAnswer) % N;

            switch (choice) {
                case 1:
                    if (map.containsKey(index))
                        map.get(index).add(y);
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(y);
                        map.put(index, list);
                    }
                    break;

                case 2:
                    lastAnswer = map.get(index).get(y % map.get(index).size());
                    pw.println(lastAnswer);
                    break;
            }
        }

        pw.close();
        scanner.close();
    }
}
