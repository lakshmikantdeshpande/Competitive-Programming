package template;

import java.io.PrintWriter;
import java.util.Scanner;

public class TemplateAndTodoz {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}

/*
	TODOs:
	(Wrong / partially correct codes)

	Game of two stacks
	Non Divisible Subset
	Walking Robots
	Visiting Manhattan
 */