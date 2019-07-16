package leetcode.google;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] graph = grid;
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, dfs(graph, i, j));
            }
        }
        return max;
    }

    private int dfs(int[][] graph, int i, int j) {
        if (i < 0 || i >= graph.length || j < 0 || j >= graph[i].length || graph[i][j] == 0) {
            return 0;
        }

        int sum = 1;
        graph[i][j] = 0;
        sum += dfs(graph, i + 1, j);
        sum += dfs(graph, i - 1, j);
        sum += dfs(graph, i, j + 1);
        sum += dfs(graph, i, j - 1);

        return sum;
    }
}
