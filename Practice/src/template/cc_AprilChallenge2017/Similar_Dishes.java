package template.cc_AprilChallenge2017;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Similar_Dishes {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int T = scanner.nextInt();

		while (T-- > 0) {
			Set<String> set = new HashSet<>();
			for (int i = 0; i < 4; i++)
				set.add(scanner.next());

			int c = 0;
			for (int i = 0; i < 4; i++)
				if (set.contains(scanner.next()))
					c++;

			if (c >= 2)
				pw.println("similar");
			else
				pw.println("dissimilar");
		}

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}