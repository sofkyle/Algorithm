package leetcode.medium.page2;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundingArea {

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    // BFS Solution
    public void solve(char[][] board) {
        int n = board.length;
        if (n <= 0) {
            return;
        }
        int m = board[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                queue.offer(new int[] {0, i});
            }
            if (board[n - 1][i] == 'O') {
                queue.offer(new int[] {n - 1, i});
            }
        }
        for (int j = 1; j < n - 1; j++) {
            if (board[j][0] == 'O') {
                queue.offer(new int[] {j, 0});
            }
            if (board[j][m - 1] == 'O') {
                queue.offer(new int[] {j, m - 1});
            }
        }

        while (!queue.isEmpty()) {
            int[] coordinate = queue.poll();
            int x = coordinate[0];
            int y = coordinate[1];
            board[x][y] = 'M';
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m
                        || board[nx][ny] != 'O') {
                    continue;
                }
                queue.offer(new int[] {nx, ny});
            }
        }

        for (int p = 0; p < n; p++) {
            for (int q = 0; q < m; q++) {
                if (board[p][q] == 'M') {
                    board[p][q] = 'O';
                } else if (board[p][q] == 'O') {
                    board[p][q] = 'X';
                }
            }
        }
    }
}
