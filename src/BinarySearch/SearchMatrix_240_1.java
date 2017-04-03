package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/10/17
 */
public class SearchMatrix_240_1
{
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null) {
            return false;
        }
        if (matrix[0].length == 0 || matrix[0] == null) {
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;
        int i = row - 1;
        int j = 0;

        while (j < column && i >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean ret = searchMatrix(nums, target);
        System.out.print(ret);
    }
}
