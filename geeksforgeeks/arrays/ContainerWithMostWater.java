package geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ContainerWithMostWater {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int[] heights = new int[n];
            String[] tokens = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                heights[i] = Integer.parseInt(tokens[i]);
            }
            writer.println(maxVolumeFromContainers(heights));
        }

        reader.close();
        writer.close();
    }

    private static int maxVolumeFromContainers(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}