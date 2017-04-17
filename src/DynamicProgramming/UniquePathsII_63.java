package DynamicProgramming;

/**
 * @Author RenXintao
 * @Date 4/16/17
 */
public class UniquePathsII_63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        if (obstacleGrid[0] == null || obstacleGrid[0].length == 0) {
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] != 1) {
                dp[i][0] = 1;
            } else {
                break;
            }
        }

        for (int j = 0; j < col; j++) {
            if (obstacleGrid[0][j] != 1) {
                dp[0][j] = 1;
            } else {
                break;
            }
        }
        for(int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[row - 1][col - 1];
    }
    public static void main(String[] args) {
//        int[][] grid= new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int[][] grid= new int[][]{{0}};
        int ret = uniquePathsWithObstacles(grid);
        System.out.print(ret);
    }
}
