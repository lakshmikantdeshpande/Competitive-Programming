import java.io.PrintWriter;
import java.util.Scanner;

public class The_Hurdle_Race {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();
		int height = scanner.nextInt();
		int drinks = 0;

		while (N-- > 0) {
			int temp = scanner.nextInt();
			if (temp > height) {
				drinks += temp - height;
				height = temp;
			}
		}

		pw.println(drinks);
		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}