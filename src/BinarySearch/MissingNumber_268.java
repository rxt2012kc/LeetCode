package BinarySearch;

import java.util.Arrays;

/**
 * @Author RenXintao
 * @Date 4/2/17
 */
public class MissingNumber_268 {
    public static int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (mid < nums[mid]) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (start < nums[start]) {
            return start;
        } else {
            return end;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1};
        int ret = missingNumber(nums);
        System.out.print(ret);
    }
}
