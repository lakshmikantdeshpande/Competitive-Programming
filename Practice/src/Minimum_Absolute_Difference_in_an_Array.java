import java.io.PrintWriter;
import java.util.Scanner;

public class Minimum_Absolute_Difference_in_an_Array {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();
		long first = Long.MIN_VALUE;
		long second = Long.MIN_VALUE;
		long[] array = new long[N];

		for (int i = 0; i < N; i++) {
			array[i] = Math.abs(scanner.nextLong());

			if (array[i] < first) {
				second = first;
				first = array[i];
			} else if (array[i] < second && array[i] != first) {
				second = array[i];
			}

		}

		pw.println(Math.abs(first - second));
		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}