package codechef.competitions.AUG17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class CHEFMOVR {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int T = parseInt(br.readLine());
    StringTokenizer strt;
    while (T-- > 0) {
      strt = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(strt.nextToken());
      int D = Integer.parseInt(strt.nextToken());

      strt = new StringTokenizer(br.readLine());
      int sum = 0;
      int[] array = new int[N];
      for (int i = 0; i < N; i++) {
        array[i] = Integer.parseInt(strt.nextToken());
        sum += array[i];
      }

      sum /= N;
      if (N == 1) {
        pw.println(array[0]);
      } else {
        int i = 0;
        int j = i + D;
        int answer = 0;

        while (j < N) {
          if (array[i] > sum) {
            int diff = array[i] - sum;
            array[i] = sum;
            array[j] += diff;
            answer += diff;
          } else if (array[i] < sum) {
            int diff = sum - array[i];
            array[i] = sum;
            array[j] -= diff;
            answer += diff;
          }

          j++;
          i++;
        }

        for (int k = 0; k < N; k++) {
          if (array[k] != sum) {
            answer = -1;
            break;
          }
        }
        pw.println(answer);
      }
    }

    pw.close();
    br.close();
  }

  private static int parseInt(String string) {
    return Integer.parseInt(string);
  }

}
