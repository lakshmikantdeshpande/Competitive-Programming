package GFG.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
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
      }
      boolean[] vis = new boolean[vertices];
      for (int i = 0; i < vertices; i++)
        vis[i] = false;
      Traversal.bfs(0, list, vis);
      System.out.println();
    }
  }

  private static class Traversal {
    static void bfs(int src, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
      Queue<Integer> queue = new LinkedList<>();
      queue.offer(src);
      visited[src] = true;

      while (!queue.isEmpty()) {
        int vertex = queue.poll();
        System.out.print(vertex + " ");
        ArrayList<Integer> adjacencyList = graph.get(vertex);
        for (int v : adjacencyList) {
          if (!visited[v]) {
            visited[v] = true;
            queue.add(v);
          }
        }
      }
    }
  }
}
