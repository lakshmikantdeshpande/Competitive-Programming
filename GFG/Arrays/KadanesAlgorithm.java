// lakshmikantdeshpande
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		int T = scanner.nextInt();
		while (T-- > 0) {
		    // Input
		    int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            
            // Logic ahead
            int current = array[0];
            int max = array[0];
            for (int i = 1; i < N; i++) {
                current = Math.max(array[i], array[i] + current);
                max = Math.max(current, max);
            }
            writer.println(max);
		}
		
		scanner.close();
		writer.close();
	}
}