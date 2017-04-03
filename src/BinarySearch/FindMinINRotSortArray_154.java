package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/11/17
 */
public class FindMinINRotSortArray_154 {
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == nums[end]) {
                end--;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid;
            }
        }

        return nums[start] <= nums[end] ? nums[start] : nums[end];
    }
    public static int findMin2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 1, 3};
        int ret = findMin(nums);
        System.out.print(ret);
    }
}