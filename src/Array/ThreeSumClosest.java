package Array;

import java.util.Arrays;

/**
 * @Author RenXintao
 * @Date 3/21/17
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

//        Arrays.sort(nums);
        int sum = 0;
        int flag = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i + 1; j--) {
                sum = nums[i] + nums[i + 1] + nums[j];
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    flag = sum;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
        int target = 82;
        int ret = threeSumClosest(nums, target);
        System.out.print(ret);
    }
}


