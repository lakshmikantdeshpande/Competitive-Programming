package geeksforgeeks.graphs;


//Initial Template for Java

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheNumberOfIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            ArrayList<ArrayList<Integer>> list = new ArrayList<>(N);

            // creating arraylist of arraylist
            for (int i = 0; i < N; i++) {
                ArrayList<Integer> temp = new ArrayList<>(M);
                list.add(i, temp);
            }

            // adding elements to the arraylist of arraylist
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int val = sc.nextInt();
                    list.get(i).add(j, val);
                }
            }

            System.out.println(Islands.findIslands(list, N, M));
        }
    }

    private static class Islands {
        private static ArrayList<ArrayList<Integer>> graph;

        static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M) {
            graph = list;
            int count = 0;

            for (int i = 0; i < graph.size(); i++) {
                for (int j = 0; j < graph.get(i).size(); j++) {
                    count += dfs(graph, i, j);
                }
            }
            return count;
        }

        private static int dfs(ArrayList<ArrayList<Integer>> graph, int i, int j) {
            if (i < 0 || i >= graph.size() || j < 0 || j >= graph.get(i).size()
                    || graph.get(i).get(j) == 0) {
                return 0;
            }

            graph.get(i).set(j, 0);

            dfs(graph, i + 1, j);
            dfs(graph, i - 1, j);
            dfs(graph, i, j + 1);
            dfs(graph, i, j - 1);
            dfs(graph, i - 1, j - 1);
            dfs(graph, i + 1, j + 1);
            dfs(graph, i - 1, j + 1);
            dfs(graph, i + 1, j - 1);

            return 1;
        }
    }
}
