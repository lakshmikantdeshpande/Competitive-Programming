import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Minimum_Distances {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int mindiff = Integer.MAX_VALUE;
        // let's store last saved distance in map
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (map.containsKey(temp)) {
                int distance = map.get(temp);
                if ((i - distance) < mindiff)
                    mindiff = i - distance;
            } else
                map.put(temp, i);
        }

        pw.println(mindiff == Integer.MAX_VALUE ? -1 : mindiff);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
