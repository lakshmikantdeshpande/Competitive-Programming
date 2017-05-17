import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class EGRANDR {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            float sum = 0f;
            boolean passedAllSubjects = true;
            boolean oneFullScore = false;

            String[] array = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(array[i]);
                if (temp <= 2)
                    passedAllSubjects = false;
                else if (temp == 5)
                    oneFullScore = true;
                sum += temp;
            }
            sum /= N;
            if (sum >= 4.0f && passedAllSubjects && oneFullScore)
                pw.println("Yes");
            else
                pw.println("No");
        }

        pw.close();
        br.close();
    }
}