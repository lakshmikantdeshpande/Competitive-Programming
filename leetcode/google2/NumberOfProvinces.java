package leetcode.google2;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNumDFS(int[][] isConnected) {
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

    public int findCircleNumBFS(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int num = queue.poll();
                    visited[num] = 1;
                    for (int j = 0; j < isConnected.length; j++) {
                        if (isConnected[num][j] == 1 && visited[j] == 0) {
                            queue.offer(j);
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }
}
