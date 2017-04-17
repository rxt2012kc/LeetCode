package DynamicProgramming;

/**
 * @Author RenXintao
 * @Date 4/17/17
 */
public class ClimbingStairs_70 {
    public static int climbStairs(int n) {
        int[] way = new int[n];
        if (n == 1) {
            way[0] = 1;
        }
        if (n > 1) {
            way[0] = 1;
            way[1] = 2;
        }
        for (int i = 2; i < n; i++) {
            way[i] = way[i - 1] + way[i - 2];
        }

        return way[n - 1];
    }
    public static int climbStairs1(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int one_step_before = 2;
        int two_step_before = 1;
        int all_ways = 0;
        for (int i = 2; i < n; i++) {
            all_ways = one_step_before + two_step_before;
            two_step_before = one_step_before;
            one_step_before = all_ways;
        }

        return all_ways;
    }
    public static void main(String[] args) {
        int n = 3;
        int ret = climbStairs1(n);
        System.out.print(ret);
    }
}
