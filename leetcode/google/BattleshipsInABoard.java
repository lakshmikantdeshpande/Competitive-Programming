package leetcode.google;

public class BattleshipsInABoard {

    public int countBattleships(char[][] board) {
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i - 1][j] == 'X') continue;
                if (j > 0 && board[i][j - 1] == 'X') continue;
                count++;
            }
        }
        return count;
    }

    public int countBattleshipsDFS(char[][] board) {
        char[][] graph = board;
        int count = 0;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                count += dfs(graph, i, j);
            }
        }
        return count;
    }

    private int dfs(char[][] graph, int i, int j) {
        if (i < 0 || i >= graph.length || j < 0 || j >= graph[i].length || graph[i][j] == '.') {
            return 0;
        }

        graph[i][j] = '.';
        dfs(graph, i + 1, j);
        dfs(graph, i - 1, j);
        dfs(graph, i, j + 1);
        dfs(graph, i, j - 1);
        return 1;
    }
}
