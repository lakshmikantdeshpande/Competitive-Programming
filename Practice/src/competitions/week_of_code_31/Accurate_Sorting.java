package competitions.week_of_code_31;

import java.io.PrintWriter;
import java.util.Scanner;

public class Accurate_Sorting {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int T = scanner.nextInt();

		while (T-- > 0) {
			boolean sortable = true; // sortable
			int q = scanner.nextInt();
			int[] array = new int[q];

			for (int i = 0; i < q; i++)
				array[i] = scanner.nextInt();

			for (int i = 0; i < q - 1; i++) {
				if (Math.abs(array[i] - array[i + 1]) == 1) {
					if (array[i] > array[i + 1])
						swap(array, i, i + 1);
				}
			}

			for (int i = 0; i < q - 1; i++)
				if (array[i] > array[i + 1]) {
					sortable = false;
					break;
				}

			if (sortable)
				pw.println("Yes");
			else
				pw.println("No");
		}

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}