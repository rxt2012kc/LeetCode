package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/10/17
 */
public class SearchMatrix_74_1 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // 异常处理，如果二维数组长度＝0或为null返回false
        if(matrix.length == 0 || matrix == null) {
            return false;
        }
        // 如果{{}}，返回false
        if (matrix[0].length == 0 || matrix[0] == null) {
            return false;
        }


        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row * column - 1;
        int mid, number;
        // 如果数组的最后一个数小于target，或者第一个数大于target，返回false
        if(matrix[0][column - 1] < target || matrix[0][0] > target) {
            return false;
        }

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            number = matrix[mid / column][mid % column];
            if (number == target) {
                return true;
            } else if (number < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (matrix[start / column][start % column] == target) {
            return true;
        } else if (matrix[end / column][end % column] == target) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//        int[][] nums = {{1,3}};
        int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 30;
        boolean ret = searchMatrix(nums, target);
        System.out.print(ret);
    }
}
