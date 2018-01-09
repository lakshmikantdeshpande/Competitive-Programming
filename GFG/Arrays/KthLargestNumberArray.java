// N time 1 space (N * N worst case complexity)
// Could be sorted, but it would yield n * logn complexity

package Arrays;

import java.io.PrintWriter;
import java.util.Scanner;

public class KthLargestNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        System.out.println("Enter number of elements (N): ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.format("Enter %d elements: ", N);
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter K: ");
        int k = scanner.nextInt();
        System.out.format("%dth largest number is %d", k, kthLargestNumber(array, k));

        scanner.close();
        writer.close();
    }

    private static int kthLargestNumber(int[] array, int k) {
        if (array == null) {
            throw new RuntimeException("Array is null");
        } else if (k > array.length || k < 0) {
            throw new RuntimeException("k is invalid");
        }

        k--;
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int i = left;
            for (int j = left + 1; j <= right; j++) {
                if (array[left] < array[j]) {
                    swap(array, ++i, j);
                }
            }
            swap(array, i, left);

            if (k < i) {
                right = i - 1;
            } else if (k > i) {
                left = i + 1;
            } else {
                return array[i];
            }
        }
        return -1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
