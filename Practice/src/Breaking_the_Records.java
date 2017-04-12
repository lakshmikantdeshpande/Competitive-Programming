import java.io.PrintWriter;
import java.util.Scanner;

public class Breaking_the_Records {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();
		long max = scanner.nextLong(), min = max;
		int maxcount = 0, mincount = 0;

		for (int i = 1; i < N; i++) {
			long temp = scanner.nextLong();
			if (temp > max) {
				max = temp;
				maxcount++;
			} else if (temp < min) {
				min = temp;
				mincount++;
			}
		}

		pw.println(maxcount + " " + mincount);
		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}