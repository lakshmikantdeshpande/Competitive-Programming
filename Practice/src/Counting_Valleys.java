import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Counting_Valleys {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int last = 0;
        int seaLevel = 0;

        String line = br.readLine();

        for (int i = 0; i < N; i++) {
            char c = line.charAt(i);

            if (c == 'U')
                seaLevel++;
            else
                seaLevel--;

            if (last < 0 && seaLevel == 0)
                count++;

            last = seaLevel;
        }

        pw.println(count);
        line = null;
        br.close();
        br = null;
        pw.close();
        pw = null;
        System.gc();
    }
}