package leetcode.google2;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int count = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    private void dfs(int i, int[][] isConnected, int[] visited) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(j, isConnected, visited);
            }
        }
    }
}
