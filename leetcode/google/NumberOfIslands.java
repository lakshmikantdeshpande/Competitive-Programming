package leetcode.google;

class NumberOfIslands {
    public int numIslands(char[][] grid) {
        char[][] graph = grid;
        int count = 0;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                count += dfs(graph, i, j);
            }
        }

        return count;
    }

    private int dfs(char[][] graph, int i, int j) {
        if (i < 0 || i >= graph.length || j < 0 || j >= graph[0].length || graph[i][j] == '0') {
            return 0;
        }

        // set current  element to 0 to avoid repeated visits
        graph[i][j] = '0';

        // visit all its neighbors
        dfs(graph, i + 1, j);
        dfs(graph, i - 1, j);
        dfs(graph, i, j + 1);
        dfs(graph, i, j - 1);

        // return 1, because an island has been explored after recursion completes
        return 1;
    }
}