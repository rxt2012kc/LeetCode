package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/10/17
 */
// 未成功
public class SearchMatrix_240_0 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null) {
            return false;
        }
        if (matrix[0].length == 0 || matrix[0] == null) {
            return false;
        }

        int start = 0;
        int end = matrix.length - 1;
        int mid, row, column;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (matrix[end][0] == target) {
            return true;
        } else if (matrix[start][0] == target) {
            return true;
        } else if (matrix[end][0] < target) {
            row = end;
        } else if (matrix[start][0] < target) {
            row = start;
        } else {
            row = end;
        }

        start = 0;
        end = matrix[row].length - 1;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (matrix[row][start] == target) {
            return true;
        } else if (matrix[row][end] == target) {
            return true;
        } else if (matrix[row][start] > target) {
            column = start;
        } else if (matrix[row][end] > target) {
            column = end;
        } else {
            return false;
        }

        start = 0;
        end = row;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (matrix[mid][column] == target) {
                return true;
            } else if (matrix[mid][column] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (matrix[start][column] == target) {
            return true;
        } else if (matrix[end][column] == target) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean ret = searchMatrix(nums, target);
        System.out.print(ret);
    }
}
