package geeksforgeeks.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int k = Integer.parseInt(reader.readLine());
            int kthSmallest = findKthSmallest(numbers, k);
            writer.println(kthSmallest);
        }

        reader.close();
        writer.close();
    }

    private static int findKthSmallest(int[] numbers, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : numbers) {
            queue.offer(num);
            if (queue.size() > k) queue.poll();
        }
        return queue.poll();
    }
}