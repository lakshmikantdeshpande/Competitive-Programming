package leetcode.google2;

public class PathWithMaximumGold {

    public int getMaximumGold(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int sum = maxGold(i, j, grid);
                max = Math.max(max, sum);
            }
        }
        return max;
    }


    private int maxGold(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }

        int sum = grid[i][j];
        grid[i][j] = 0;
        int down = maxGold(i + 1, j, grid);
        int up = maxGold(i - 1, j, grid);
        int right = maxGold(i, j + 1, grid);
        int left = maxGold(i, j - 1, grid);
        grid[i][j] = sum;
        return sum + Math.max(left, (Math.max(right, Math.max(up, down))));
    }
}
