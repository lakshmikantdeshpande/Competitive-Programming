import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Divisible_Sum_Pairs {

	static Scanner scanner = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws IOException {
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++)
			array[i] = scanner.nextInt();

		int count = 0;

		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				if ((array[i] + array[j]) % K == 0)
					++count;

		pw.println(count);
		pw.close();
		pw = null;
		array = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}
