package GFG.Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class XTotalShapes {

  private static int directionI[] = new int[]{1, -1, 0, 0};
  private static int directionJ[] = new int[]{0, 0, 1, -1};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);

    int testCases = Integer.parseInt(br.readLine());
    while (testCases-- > 0) {
      String[] boundaries = br.readLine().split(" ");
      int m = Integer.parseInt(boundaries[0]);
      int n = Integer.parseInt(boundaries[1]);
      String[] graph = br.readLine().split(" ");
      int count = getShapeCount(m, n, graph);
      writer.println(count);
    }

    br.close();
    writer.close();
  }

  private static int getShapeCount(int m, int n, String[] graph) {
    boolean[][] visited = new boolean[m][n];
    int count = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (!visited[i][j] && isValid(i, j, m, n, graph)) {
          dfs(i, j, m, n, graph, visited);
          count++;
        }
      }
    }
    return count;
  }

  private static void dfs(int i, int j, int m, int n, String[] graph, boolean[][] visited) {
    visited[i][j] = true;

    for (int k = 0; k < 4; k++) {

      int ii = i + directionI[k];
      int jj = j + directionJ[k];

      if (isValid(ii, jj, m, n, graph) && !visited[ii][jj]) {
        dfs(ii, jj, m, n, graph, visited);
      }
    }
  }

  private static boolean isValid(int i, int j, int m, int n, String[] graph) {
    if (i < 0 || i >= m || j < 0 || j >= n) {
      return false;
    }

    return graph[i].charAt(j) == 'X';
  }
}