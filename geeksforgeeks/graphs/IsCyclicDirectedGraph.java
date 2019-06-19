package geeksforgeeks.graphs;

import java.util.ArrayList;
import java.util.Scanner;

class IsCyclicDirectedGraph {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      int nov = sc.nextInt();
      int edg = sc.nextInt();
      for (int i = 0; i < nov + 1; i++)
        list.add(i, new ArrayList<Integer>());
      for (int i = 1; i <= edg; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        list.get(u).add(v);
      }
      System.out.println(DetectCycle.isCyclic(list, nov) ? "1" : "0");
    }
  }

  /*This is a function problem.You only need to complete the function given below*/
  private static class DetectCycle {
    static boolean isCyclic(ArrayList<ArrayList<Integer>> graph, int vertices) {
      boolean[] visited = new boolean[vertices];
      boolean[] recursionStack = new boolean[vertices];

      for (int i = 0; i < vertices; i++) {
        if (isGraphCyclic(i, visited, recursionStack, graph)) {
          return true;
        }
      }
      return false;
    }

    private static boolean isGraphCyclic(int vertex, boolean[] visited,
                                         boolean[] recursionStack, ArrayList<ArrayList<Integer>> graph) {

      if (recursionStack[vertex]) return true;
      if (visited[vertex]) return false;

      visited[vertex] = true;
      recursionStack[vertex] = true;

      for (int adj : graph.get(vertex)) {
        if (isGraphCyclic(adj, visited, recursionStack, graph)) {
          return true;
        }
      }

      recursionStack[vertex] = false;
      return false;
    }
  }
}
