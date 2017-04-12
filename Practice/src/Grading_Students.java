import java.io.PrintWriter;
import java.util.Scanner;

public class Grading_Students {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();

		while (N-- > 0) {
			int grade = scanner.nextInt();
			if (grade < 38)
				pw.println(grade);
			else if (grade % 5 > 2)
				pw.println(grade + (5 - grade % 5));
			else
				pw.println(grade);
		}

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}
