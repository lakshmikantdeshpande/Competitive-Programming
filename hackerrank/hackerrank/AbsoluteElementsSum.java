package hackerrank.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsoluteElementsSum {

    // Complete the playingWithNumbers function below.
    static long[] playingWithNumbers(int[] array, int[] queries) {
        final int n = array.length;
        long[] result = new long[queries.length];
        long[] prefixSumArray = new long[n + 1];

        prefixSumArray[0] = array[0];

        for (int i = 1; i < n; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + array[i];
        }

        long sum = 0;
        int count = queries.length;
        for (int i = 0; i < count; i++) {
            sum += queries[i];
            long first = array[0] + sum;
            long last = array[n - 1] + sum;
            if (first <= 0 && last <= 0 || first >= 0 && last >= 0) {
                result[i] = Math.abs(prefixSumArray[n - 1] + n * sum);
            } else {
                int low = getLower(array, n, sum);
                result[i] = Math.abs(prefixSumArray[low] + sum * (low + 1)) + (prefixSumArray[n - 1] - prefixSumArray[low]) + sum * (n - low - 1);
            }
        }
        return result;
    }

    private static int getLower(int[] array, int n, long sum) {
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] + sum < 0) {
                if (low == mid) {
                    if (array[high] + sum <= 0) {
                        low = high;
                    } else {
                        break;
                    }
                } else {
                    low = mid;
                }
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];

        String[] arrItems = bufferedReader.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int q = Integer.parseInt(bufferedReader.readLine().trim());
        int[] queries = new int[q];

        String[] queriesItems = bufferedReader.readLine().split(" ");
        for (int i = 0; i < q; i++) {
            int queriesItem = Integer.parseInt(queriesItems[i]);
            queries[i] = queriesItem;
        }

        long[] result = playingWithNumbers(arr, queries);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            builder.append(result[i]).append('\n');
        }
        bufferedWriter.write(builder.toString());
        bufferedWriter.close();

        bufferedReader.close();
    }
}
