import java.io.PrintWriter;
import java.util.Scanner;

public class Apple_and_Orange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int homeStart = scanner.nextInt(); // Sam's house starts at this point
        int homeEnd = scanner.nextInt(); // Sam's house ends at this point
        int appleTree = scanner.nextInt();
        int orangeTree = scanner.nextInt();
        int appleCount = scanner.nextInt(); // number of apples
        int orangeCount = scanner.nextInt(); // number of oranges

        int apples = 0;
        for (int i = 0; i < appleCount; i++) {
            int apple = scanner.nextInt();
            apple = apple + appleTree;
            if (apple >= homeStart && apple <= homeEnd)
                apples++;
        }

        int oranges = 0;
        for (int i = 0; i < orangeCount; i++) {
            int orange = scanner.nextInt();
            orange = orange + orangeTree;
            if (orange >= homeStart && orange <= homeEnd)
                oranges++;
        }

        pw.println(apples + "\n" + oranges);
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();

    }

}
