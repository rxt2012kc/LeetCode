package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/8/17
 */
public class FindPeakElement_162 {
    public static int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return nums[start] > nums[end] ? start : end;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        int ret = findPeakElement(nums);
        System.out.print(ret);
    }
}
