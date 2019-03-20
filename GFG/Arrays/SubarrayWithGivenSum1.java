// lakshmikantd
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
// N * N time 1 space

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
	
	private static void printSumSubarray(int[] array, int requiredSum) {
	    for (int i = 0; i < array.length; i++) {
	        int start = i;
	        int sum = array[start];
	        for (int j = i + 1; j <= array.length; j++) {
                if (sum == requiredSum) {
	                System.out.println((start + 1) + " " + (j));
	                return;
	            }
	            if (sum > requiredSum || j == array.length) {
                    break;
	            }
	            sum += array[j];
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
};