package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/10/17
 */
public class SearchMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // 异常处理，如果二维数组长度＝0或为null返回false
        if(matrix.length == 0 || matrix == null) {
            return false;
        }
        // 如果{{}}，返回false
        if (matrix[0].length == 0 || matrix[0] == null) {
            return false;
        }

        int index = 0;
        int start = 0;
        int end = matrix.length - 1;
        int mid;
        // 如果数组的最后一个数小于target，或者第一个数大于target，返回false
        if(matrix[end][matrix[0].length - 1] < target || matrix[start][0] > target) {
            return false;
        }
        while (start < end - 1) {
            mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        // 判断第一个大于target的位置，则target所在的位置为该位置前的一个数组中，
        if (matrix[start][0] == target) {
            return true;
        } else if (matrix[end][0] == target) {
            return true;
        } else if(matrix[start][0] > target) {
            index = start - 1;
        } else if(matrix[end][0] > target) {
            index = end - 1;
        // 如果最后一个数组的第一个值仍比target小，则target所在的位置为最后一个数组
        } else {
            index = end;
        }

        // 找到target所在的数组，对该数组进行二分查找
        start = 0;
        end = matrix[index].length - 1;
        while (start < end - 1) {
            mid = start + (end - start) / 2;
            if (matrix[index][mid] == target) {
                return true;
            }
            if (matrix[index][mid] < target) {
                start = mid;
            }
            if (matrix[index][mid] > target) {
                end = mid;
            }
        }
        if (matrix[index][start] == target) {
            return true;
        } else if (matrix[index][end] == target) {
            return true;
        } else {
            return false;
        }
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
