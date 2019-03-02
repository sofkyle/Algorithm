package leetcode.easy.page3;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int len = grid.length;

        int perimeter = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 < 0) {
                        perimeter++;
                    } else {
                        if (grid[i - 1][j] == 0) perimeter++;
                    }
                    if (j - 1 < 0) {
                        perimeter++;
                    } else {
                        if (grid[i][j - 1] == 0) perimeter++;
                    }
                    if (i + 1 >= len) {
                        perimeter++;
                    } else {
                        if (grid[i + 1][j] == 0) perimeter++;
                    }
                    if (j + 1 >= len) {
                        perimeter++;
                    } else {
                        if (grid[i][j + 1] == 0) perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }
}
