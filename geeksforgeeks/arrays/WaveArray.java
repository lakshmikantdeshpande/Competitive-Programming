package geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class WaveArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            int N = Integer.parseInt(reader.readLine());
            int[] array = new int[N];
            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < N; i++) array[i] = Integer.parseInt(line[i]);

            //wiggleSort(array);
            wiggle(array);
            for (int i = 0; i < N; i++) writer.print(array[i] + " ");
            writer.println();
        }

        reader.close();
        writer.close();
    }

    private static void wiggle(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            if ((i % 2 == 0) && (array[i] < array[i + 1])) {
                swap(array, i, i + 1);
            }
        }
    }

    private static void wiggleSort(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i += 2) {
            swap(array, i, i + 1);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }
}
