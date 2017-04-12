import java.io.PrintWriter;
import java.util.Scanner;

public class Birthday_Chocolate {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();
		int[] array = new int[N];

		// get the chocolate bar
		for (int i = 0; i < N; i++)
			array[i] = scanner.nextInt();

		int D = scanner.nextInt();
		int M = scanner.nextInt();
		int ways = 0;
		int tempsum = 0;

		for (int i = 0; i < N - M + 1; i++) {
			tempsum = 0;
			for (int j = i; j < i + M; j++)
				if (tempsum <= D)
					tempsum += array[j];
				else
					break;
			if (tempsum == D)
				ways++;
		}

		pw.println(ways);
		pw.close();
		pw = null;
		array = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}