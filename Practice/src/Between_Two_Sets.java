import java.io.PrintWriter;
import java.util.Scanner;

public class Between_Two_Sets {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		// lcm of all numbers
		int lcm = scanner.nextInt();
		for (int i = 1; i < N; i++)
			lcm = lcm(lcm, scanner.nextInt());

		// gcd of all numbers
		int gcd = scanner.nextInt();
		for (int i = 1; i < M; i++)
			gcd = gcd(gcd, scanner.nextInt());

		int count = 0;
		for (int i = lcm, j = 2; i <= gcd; i = lcm * j, j++)
			if ((gcd % i) == 0)
				count++;

		pw.println(count);
		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}

	private static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}

	private static int lcm(int x, int y) {
		return x * (y / gcd(x, y));
	}
}