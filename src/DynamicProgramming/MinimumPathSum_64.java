package DynamicProgramming;

/**
 * @Author RenXintao
 * @Date 4/16/17
 */
public class MinimumPathSum_64 {
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        if (grid[0] == null || grid[0].length == 0) {
            return -1;
        }

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 1; i < row; i++) {
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < col; j++) {
            grid[0][j] = grid[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }

        return grid[row - 1][col - 1];
    }
    public static int minPathSum1(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        if (grid[0] == null || grid[0].length == 0) {
            return -1;
        }

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j != 0) {
                    grid[i][j] = grid[0][j - 1] + grid[i][j];
                } else if (i != 0 && j == 0) {
                    grid[i][j] = grid[i - 1][0] + grid[i][j];
                } else if (i == 0 && j == 0) {
                    grid[i][j] = grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }

        return grid[row - 1][col - 1];
    }
    public static void main(String[] args) {
        int[][] grid= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int ret = minPathSum1(grid);
        System.out.print(ret);
    }
}