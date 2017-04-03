package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/10/17
 */
public class Solution35_1 {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;
        if (nums[0] > target) {
            return 0;
        }
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                start = mid;
//                return mid;
            }
            if (nums[mid] < target) {
                start = mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }
        }
        if (nums[end] < target) {
            return end + 1;
        } else if (nums[end] == target) {
            return end;
        } else if (nums[start] == target) {
            return start;
        } else {
            return start + 1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int ret = searchInsert(nums, target);
        System.out.print(ret);
    }
}
