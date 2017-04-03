package TwoPointer;

/**
 * @Author RenXintao
 * @Date 3/20/17
 */
public class RemoveDuplicatesSortedArray_26 {
    public static int removeDuplicates(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int size = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[size]) {
                A[++size] = A[i];
            }
        }
        return size + 1;
//        if (nums == null) {
//            return 0;
//        }
//
//        int index = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                index++;
//                continue;
//            }
//        }
//
//        return nums.length - index;
    }
    public static void main(String[] args) {
        int[] A = {1, 1, 2};
        int ret = removeDuplicates(A);
        System.out.print(ret);
    }
}
