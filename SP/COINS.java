// lakshmikantd
// COINS

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.PrintWriter;

class COINS {

	private static final Map<Long, Long> map = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter printWriter = new PrintWriter(System.out);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			long N = Long.parseLong(line);
			printWriter.println(getMaxPossibleCoins(N));
		}

		printWriter.close();
		scanner.close();
	}

	public static long getMaxPossibleCoins(long N) {
		if (N == 0) {
			return 0;
		} else if (map.containsKey(N)) {
			return map.get(N);
		}

		long maximum = getMaxPossibleCoins(N / 2) + getMaxPossibleCoins(N / 3) 
			   + getMaxPossibleCoins(N / 4); 

		map.put(N, Math.max(N, maximum));
		return map.get(N);
	}

}
