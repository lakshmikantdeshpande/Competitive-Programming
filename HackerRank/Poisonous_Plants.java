// N time N space

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

class Poisonous_Plants {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = parseInt(br.readLine());
        List<Long> list = new LinkedList<>();

        // initially we get the reverse stack, so we used stack.peek() >= temp instead of <=
        StringTokenizer strt = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(parseLong(strt.nextToken()));
        }

        if (N == 1)
            pw.println(0);
        else {
            boolean isFinished = false;
            int counter = 0;

            while (!isFinished) {
                boolean plantDied = false;
                ListIterator<Long> iterator = list.listIterator();
                long last = iterator.next();

                while (iterator.hasNext()) {
                    long temp = iterator.next();
                    if (temp > last) {
                        iterator.remove();
                        plantDied = true;
                    }
                    last = temp;
                }

                // if no plants die, dying will be finished (isFinished = true)
                if (!plantDied)
                    isFinished = true;
                else
                    counter++;
            }
            pw.println(counter);
        }

        pw.close();
        br.close();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

    private static long parseLong(String string) {
        return Long.parseLong(string);
    }
}
