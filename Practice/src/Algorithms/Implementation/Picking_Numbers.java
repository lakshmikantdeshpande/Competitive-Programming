package Algorithms.Implementation;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Picking_Numbers {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt();
		int[] array = new int[N];
		
		int j = 0;
		while (j < N) {
			array[j++] = scanner.nextInt();
		}

		Arrays.sort(array);
		int p = 0;
		for (int i = 0; i < N - 1; i++)
			if (Math.abs(array[i] - array[i+1]) <= 1)
				p++;
		
		out.println(p);
		out.close();
		out = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}