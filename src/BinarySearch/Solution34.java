package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/8/17
 */
public class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        if(nums.length == 0 || nums == null) {
            ret[0] = ret[1] = -1;
            return ret;
        }

        // left search
        int start = 0;
        int end = nums.length - 1;
        int middle;
        while (start + 1 < end) {
            middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                end = middle;
            }
            if (nums[middle] < target) {
                start = middle;
            }
            if (nums[middle] > target) {
                end = middle;
            }
        }
        if (nums[start] == target) {
            ret[0] = start;
        } else if (nums[end] == target) {
            ret[0] = end;
        } else {
            ret[0] = ret[1] = -1;
            return ret;
        }

        // right search
        start = 0;
        end = nums.length - 1;
        while (start + 1 < end) {
            middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                start = middle;
            }
            if (nums[middle] < target) {
                start = middle;
            }
            if (nums[middle] > target) {
                end = middle;
            }
        }
        if (nums[end] == target) {
            ret[1] = end;
        } else if (nums[start] == target) {
            ret[1] = start;
        } else {
            ret[1] = ret[1] = -1;
            return ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] num = {2, 2, 2};
        int[] ret = searchRange(num, 2);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
        System.out.print(ret);

    }
}
