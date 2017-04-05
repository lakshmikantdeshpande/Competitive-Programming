import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Picking_Numbers {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt();
		int[] array = new int[N];
		int[] hash = new int[100];

		Arrays.fill(hash, 0);

		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
			hash[array[i]]++;
		}

		for (int i = 0; i < 99; i++)
			hash[i] += hash[i + 1];

		Arrays.sort(hash);

		array = null;
		out.println(hash[99]);
		out.close();
		out = null;
		hash = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}