package leetcode.easy.page3;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int height = grid.length;
        int weight = grid[0].length;

        int perimeter = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
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
                    if (i + 1 >= height) {
                        perimeter++;
                    } else {
                        if (grid[i + 1][j] == 0) perimeter++;
                    }
                    if (j + 1 >= weight) {
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
