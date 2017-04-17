package DynamicProgramming;

/**
 * @Author RenXintao
 * @Date 4/17/17
 */
public class JumpGame_55 {
    // dp
    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        boolean[] can = new boolean[nums.length];
        can[0] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (can[j] && j + nums[j] >= i) {
                    can[i] = true;
                    break;
                }
            }
        }

        return can[nums.length - 1];
    }
    // greedy
    public static boolean canJump1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int farthest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i <= farthest && i + nums[i] >= farthest) {
                farthest = i + nums[i];
            }
        }

        return farthest >= nums.length - 1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        boolean ret = canJump1(nums);
        System.out.print(ret);
    }
}
