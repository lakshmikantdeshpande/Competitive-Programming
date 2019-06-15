package GFG.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

class DFS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      int nov = sc.nextInt();
      int edg = sc.nextInt();
      for (int i = 0; i < nov; i++)
        list.add(i, new ArrayList<Integer>());

      for (int i = 1; i <= edg; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        list.get(u).add(v);
        list.get(v).add(u);
      }
      boolean[] vis = new boolean[nov];
      for (int i = 0; i < nov; i++)
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
