import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algorithmic_Crush {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		long N = scanner.nextLong();
		long Q = scanner.nextLong();

		Map<Long, Long> map = new HashMap<Long, Long>();
		long p = 0;
		long max = 0;

		for (long i = 0; i < Q; i++) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long k = scanner.nextLong();
			map.put(a, map.get(a) == null ? k : map.get(a) + k);
			if (b + 1 <= N)
				map.put(b + 1, map.get(b + 1) == null ? 0 - k : map.get(b + 1) - k);

		}

		for (long i = 1; i <= N; i++) {
			p = (map.get(i) == null ? p : p + map.get(i));
			max = Math.max(p, max);
		}
		out.println(max);

		out.close();
		out = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}