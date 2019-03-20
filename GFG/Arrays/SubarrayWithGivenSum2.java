// lakshmikantd
// https://www.geeksforgeeks.org/find-subarray-with-given-sum/
// N time 1 space

import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while (T-- > 0) {
			int N = scanner.nextInt();
		    int requiredSum = scanner.nextInt();
		    int[] array = getArray(scanner, N);
		    printSumSubarray(array, requiredSum);
		}
		
		scanner.close();
	}
	

	/*
		**********0*****
		0 is start
		look for elements before 0

	*/
	private static void printSumSubarray(int[] array, int requiredSum) {
		int sum = array[0];
		int start = 0;
	    for (int i = 1; i <= array.length; i++) {
	    	// Keep reducing the sum until it becomes equal to sum
	    	while (sum > requiredSum && start < i - 1) {
	    		sum -= array[start++];
	    	}

	    	if (sum == requiredSum) {
	    		System.out.println(start + 1 + " " + i);
	    		return;
	    	}

	    	if (i < array.length) {
	    		sum += array[i];
	    	}
	    }
	    System.out.println(-1);
	}
	
	private static int[] getArray(Scanner scanner, int N) {
	    int[] array = new int[N];
	    for (int i = 0; i < N; i++) {
	        array[i] = scanner.nextInt();
	    }
	    return array;
	}
}