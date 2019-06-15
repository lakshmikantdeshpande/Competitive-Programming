package GFG.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

class DFS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      int vertices = sc.nextInt();
      int edges = sc.nextInt();
      for (int i = 0; i < vertices; i++)
        list.add(i, new ArrayList<>());

      for (int i = 1; i <= edges; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        list.get(u).add(v);
        list.get(v).add(u);
      }
      boolean[] vis = new boolean[vertices];
      for (int i = 0; i < vertices; i++)
        vis[i] = false;
      Traversal.dfs(0, list, vis);
      System.out.println();
    }
  }

  private static class Traversal {
    static void dfs(int src, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
      visited[src] = true;
      System.out.print(src + " ");

      for (int i : graph.get(src)) {
        if (!visited[i]) {
          dfs(i, graph, visited);
        }
      }
    }
  }
}
