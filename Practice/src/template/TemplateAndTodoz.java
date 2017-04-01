package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TemplateAndTodoz {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// static Scanner scanner = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		// String line = br.readLine();
		int N = Integer.parseInt(br.readLine());

		StringTokenizer str = new StringTokenizer(br.readLine());

		pw.close();
		pw = null;
		br.close();
		br = null;
		str = null;
		System.gc();
	}
}