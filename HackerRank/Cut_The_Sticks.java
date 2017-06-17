import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Cut_The_Sticks {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        while (N-- > 0)
            list.add(scanner.nextInt());

        pw.println(list.size());
        while (!list.isEmpty()) {
            int smallest = list.stream().min(Integer::compare).get();
            for (ListIterator<Integer> iterator = list.listIterator(); iterator.hasNext(); ) {
                int temp = iterator.next() - smallest;
                if (temp <= 0)
                    iterator.remove();
                else
                    iterator.set(temp);
            }
            pw.println(!list.isEmpty() ? list.size() : "");
        }

        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}
