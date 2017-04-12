package competitions.week_of_code_31;

import java.io.PrintWriter;
import java.util.Scanner;

public class Zero_One_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = scanner.nextInt();
		while (N-- > 0) {
			int temp = scanner.nextInt();
			int[] array = new int[temp];
			for (int j = 0; j < temp; j++) {
				array[j] = scanner.nextInt();
			}

			int count = findRemovable(array);
			array = removeNumber(array);
			count += countZeros(array);

			if (count % 2 == 0)
				pw.println("Bob");
			else
				pw.println("Alice");

		}

		pw.close();
		pw = null;
		scanner.close();
		scanner = null;
		System.gc();
	}

	private static int countZeros(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == 0 && array[i + 1] == 0 && array[i + 2] == 0) {
				count++;
			}
		}

		return count;
	}

	private static int findRemovable(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == 0 && array[i + 1] == 1 && array[i + 2] == 0) {
				count++;
			}
		}

		return count;
	}

	private static int[] removeNumber(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == 0 && array[i + 1] == 1 && array[i + 2] == 0) {
				array[i + 1] = -1;
				count++;
			}
		}

		int[] backup = new int[array.length - count];
		int j = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				backup[++j] = array[i];
			}
		}
		return backup;
	}

}
