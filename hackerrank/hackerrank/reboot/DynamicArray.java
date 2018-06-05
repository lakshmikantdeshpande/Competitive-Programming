package hackerrank.hackerrank.reboot;

import java.io.PrintWriter;
import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int T = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int lastAnswer = 0;

        while (T-- > 0) {
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
                    writer.println(lastAnswer);
                    break;
            }
        }

        scanner.close();
        writer.close();
    }

}
