import java.io.PrintWriter;
import java.util.Scanner;

public class Left_Rotation {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt(); // number of elements
		int R = scanner.nextInt(); // number of rotations

		int[] array = new int[N];

		for (int i = 0; i < N; i++)
			array[i] = scanner.nextInt();

		int counter = 0;
		for (int i = R % N; counter < N; counter++, i = (i + 1) % N)
			out.print(array[i] + " ");

		out.close();
		out = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}