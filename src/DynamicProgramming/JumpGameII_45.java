package DynamicProgramming;

/**
 * @Author RenXintao
 * @Date 4/17/17
 */
public class JumpGameII_45 {
    public static int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // state
        int[] step = new int[nums.length];
        // initialize
        step[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            step[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (step[j] != Integer.MAX_VALUE && j + nums[j] >= i) {
                    step[i] = Math.min(step[i], step[j] + 1);
                }
            }
        }

        return step[nums.length - 1];
    }

    // version 2: Greedy
    public static int jump1(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = 0, jumps = 0;
        while (end < A.length - 1) {
            jumps++;
            int farthest = end;
            for (int i = start; i <= end; i++) {
                if (A[i] + i > farthest) {
                    farthest = A[i] + i;
                }
            }
            start = end + 1;
            end = farthest;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int ret = jump1(nums);
        System.out.print(ret);
    }
}
