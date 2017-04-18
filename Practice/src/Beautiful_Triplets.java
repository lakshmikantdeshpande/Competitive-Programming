import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Beautiful_Triplets {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int difference = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        int counter = 0;

        while (N-- > 0)
            set.add(scanner.nextInt());

        for (int i : set) {
            if (set.contains(i + difference) && set.contains(i + 2 * difference))
                counter++;
        }

        pw.println(counter);
        pw.close();
        pw = null;
        set = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}