package template.cc_AprilChallenge2017;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Dish_Of_Life {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();

        while (N-- > 0) {
            int islands = scanner.nextInt();
            int ingredients = scanner.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            short status = -1;

            // 0 sad
            // 1 some
            // 2 all

            for (int i = 0; i < islands; i++) {
                int island = scanner.nextInt();
                while (island-- > 0) {
                    int temp = scanner.nextInt();
                    if (temp <= ingredients)
                        set.add(temp);
                }

                if (status == -1) {
                    if (set.size() == ingredients && i == 0)
                        if (islands == 1)
                            status = 2;
                        else
                            status = 1;
                    else if (set.size() == ingredients && i < islands - 1)
                        status = 1;
                    else if (set.size() == ingredients && i == islands - 1)
                        status = 2;
                }
            }

            if (status == -1)
                pw.println("sad");
            else
                pw.println(status == 1 ? "some" : "all");
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}