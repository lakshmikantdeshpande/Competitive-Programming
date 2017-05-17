import java.io.PrintWriter;
import java.util.Scanner;

class LCOLLIS {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            char[][] array = new char[N][M];
            scanner.nextLine();

            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextLine().toCharArray();
            }
            pw.println(solve(array, N, M));
        }

        pw.close();
        scanner.close();
    }

    private static int solve(char[][] array, int N, int M) {
        int answer = 0;
        for (int i = 0; i < M; i++) {
            int counter = 0;
            for (int j = 0; j < N; j++) {
                if (array[j][i] == '1')
                    counter++;
            }
            answer += (counter * (counter - 1)) / 2;
        }
        return answer;
    }
}