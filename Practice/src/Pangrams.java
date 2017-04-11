import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	static Scanner scanner = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		Set<Character> set = new HashSet<Character>();

		while (scanner.hasNext()) {
			String string = scanner.next().toLowerCase();
			for (int i = 0; i < string.length(); i++)
				set.add(string.charAt(i));
		}

		if (set.size() == 26)
			pw.println("pangram");
		else
			pw.println("not pangram");

		pw.close();
		pw = null;
		set = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}