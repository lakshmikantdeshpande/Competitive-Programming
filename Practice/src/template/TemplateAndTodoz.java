package template;

import java.io.PrintWriter;
import java.util.Scanner;

public class TemplateAndTodoz {

	static Scanner scanner = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt();

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}