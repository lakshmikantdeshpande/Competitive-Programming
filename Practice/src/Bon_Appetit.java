import java.io.PrintWriter;
import java.util.Scanner;

public class Bon_Appetit {

	static Scanner scanner = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int sum = 0;
		int kthItem = 0;
		int moneyToBeReturned = 0;

		for (int i = 0; i < N; i++)
			if (i == K) {
				kthItem = scanner.nextInt();
				sum += kthItem;
			} else {
				sum += scanner.nextInt();
			}

		moneyToBeReturned = scanner.nextInt();

		if (sum / 2 == moneyToBeReturned)
			pw.println(kthItem / 2);
		else
			pw.println("Bon Appetit");

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}