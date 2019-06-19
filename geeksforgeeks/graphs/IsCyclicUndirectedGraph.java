package geeksforgeeks.graphs;

import java.util.ArrayList;
import java.util.Scanner;

class IsCyclicUndirectedGraph {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      int nov = sc.nextInt();
      int edg = sc.nextInt();

      for (int i = 0; i < nov + 1; i++)
        list.add(i, new ArrayList<>());

      for (int i = 1; i <= edg; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        list.get(u).add(v);
        list.get(v).add(u);
      }
      System.out.println(DetectCycle.isCyclic(list, nov) ? "1" : "0");
    }
  }

  private static class DetectCycle {
    static boolean isCyclic(ArrayList<ArrayList<Integer>> graph, int vertices) {
      boolean[] visited = new boolean[vertices];

      for (int v = 0; v < vertices; v++) {
        if (!visited[v]) {
          if (isGraphCyclic(v, visited, graph, -1)) {
            return true;
          }
        }
      }
      return false;
    }

    private static boolean isGraphCyclic(int vertex, boolean[] visited,
                                         ArrayList<ArrayList<Integer>> graph, int parent) {
      visited[vertex] = true;

      for (int adj : graph.get(vertex)) {
        if (!visited[adj]) {
          if (isGraphCyclic(adj, visited, graph, vertex)) {
            return true;
          }
        } else if (adj != parent) {
          return true;
        }
      }
      return false;
    }
  }

}
