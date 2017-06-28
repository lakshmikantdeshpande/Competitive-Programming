// TODO

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bigger_Is_Greater {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            String string = scanner.nextLine();
            List<Pair> list = new ArrayList<>();

            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                list.add(new Pair(c, i));
            }
            Collections.sort(list); // sorted by characters
            if (list.get(0).character == list.get(list.size() - 1).character) {
                pw.println("no answer");
                continue;
            }

            int i = 0;
            Pair pair = list.get(0);
            char last = (char) pair.character;
            for (i = 1; i < list.size(); i++) {
                Pair pa = list.get(i);
                if (pa.character > last && pa.index > pair.index) {
                    pw.println(swap(string, pair.index, pa.index));
                }
            }
        }
        pw.close();
        scanner.close();
    }

    private static String swap(String temp, int i, int j) {
        StringBuilder strb = new StringBuilder();
        for (int k = 0; k < temp.length(); k++) {
            if (k == i)
                strb.append(temp.charAt(j));
            else if (k == j)
                strb.append(temp.charAt(i));
            else
                strb.append(temp.charAt(k));
        }
        return strb.toString();
    }

    private static class Pair implements Comparable {
        int character;
        int index;

        public Pair(int character, int index) {
            this.character = character;
            this.index = index;
        }

        @Override
        public int compareTo(Object o) {
            if (this.character < ((Pair) o).character)
                return -1;
            else if (this.character > ((Pair) o).character)
                return 1;
            return 0;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "character=" + character +
                    ", index=" + index +
                    '}';
        }
    }
}
