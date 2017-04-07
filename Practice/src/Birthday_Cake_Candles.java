import java.io.PrintWriter;
import java.util.Scanner;

public class Birthday_Cake_Candles {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt();
		int max = Integer.MIN_VALUE, maxcount = 0, current = -1;
		for (int i = 0; i < N; i++) {
			current = scanner.nextInt();
			if (current > max) {
				max = current;
				maxcount = 1;
			} else if (current == max)
				maxcount++;
		}
		pw.println(maxcount);
		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}