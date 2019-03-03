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

    private int perimeterGlobal = 0;

    /**
     * Optimize Method: To find the first land, Then recurse in four directions.
     * Error: StackOverflow
     * @param grid
     * @return
     */
    public int islandPerimeterOptimize(int[][] grid) {

        int height = grid.length;
        int weight = grid[0].length;

        int[][] accessFlag = new int[height][weight];

        // Sign the first land
        int firstI = 0;
        int firstJ = 0;
        boolean findTheLand = false;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (grid[i][j] == 1) {
                    firstI = i;
                    firstJ = j;
                    findTheLand = true;
                    break;
                }
            }
            if (findTheLand) {
                break;
            }
        }

        recurseTheIsland(grid, accessFlag, firstI, firstJ, height, weight);

        return perimeterGlobal;
    }

    private void recurseTheIsland(int[][] grid, int[][] accessFlag, int i, int j, int height, int weight) {
        if (accessFlag[i][j] == 1) return;

        if (i == 0 || j == 0 || i == height - 1 || j == weight - 1) {
            perimeterGlobal++;
            accessFlag[i][j] = 1;
        }

        if (i > 0 && j > 0 && i < height && j < weight && grid[i][j] == 0) {
            perimeterGlobal++;
            accessFlag[i][j] = 1;
        }

        if (i > 0 && grid[i - 1][j] == 1 && accessFlag[i - 1][j] == 0) {
            recurseTheIsland(grid, accessFlag, i - 1, j, height, weight);
        }
        if (j > 0 && grid[i][j - 1] == 1 && accessFlag[i][j - 1] == 0) {
            recurseTheIsland(grid, accessFlag, i, j - 1, height, weight);
        }
        if (i < height - 1 && grid[i + 1][j] == 1 && accessFlag[i = 1][j] == 0) {
            recurseTheIsland(grid, accessFlag, i + 1, j , height, weight);
        }
        if (j < weight - 1 && grid[i][j + 1] == 1 && accessFlag[i][j + 1] == 0) {
            recurseTheIsland(grid, accessFlag, i, j + 1, height, weight);
        }
    }
}
