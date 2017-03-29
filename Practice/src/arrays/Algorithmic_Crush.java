package arrays;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algorithmic_Crush {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		scanner.nextLong();
		long Q = scanner.nextLong();
		long temp = 0;

		long max = Long.MIN_VALUE;
		Map<Long, Long> map = new HashMap<Long, Long>();

		for (long i = 0; i < Q; i++) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long k = scanner.nextLong();

			for (long c = a; c <= b; c++) {
				if (map.containsKey(c)) {
					temp = map.get(c) + k;
					map.put(c, temp);
				} else {
					temp = k;
					map.put(c, k);
				}
				if (temp > max)
					max = temp;
			}
		}
		out.println(max);

		out.close();
		out = null;
		scanner.close();
		scanner = null;
		map = null;
		System.gc();
	}
}