package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/10/17
 */
public class Solution35_0 {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;
        if (nums[end] < target) {
            return end + 1;
        }
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid;
//                return mid;
            }
            if (nums[mid] < target) {
                start = mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }
        }
        if (nums[start] >= target) {
            return start;
        } else if (nums[end] >= target) {
            return end;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 5, 6};
        int target = 7;
        int ret = searchInsert(nums, target);
        System.out.print(ret);
    }
}
