package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/11/17
 */
public class FindMinINRotSortArray_153 {
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid;
            }
        }

        return nums[start] < nums[end] ? nums[start] : nums[end];
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int ret = findMin(nums);
        System.out.print(ret);
    }
}