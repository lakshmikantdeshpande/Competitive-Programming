package leetcode.amazon;

public class ContainerWithMostWater {
    public int bruteForce(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, (j - i) * (Math.min(height[i], height[j])));
            }
        }
        return max;
    }
}
