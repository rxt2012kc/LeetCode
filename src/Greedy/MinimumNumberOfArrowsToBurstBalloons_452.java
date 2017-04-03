package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author RenXintao
 * @Date 3/31/17
 */
public class MinimumNumberOfArrowsToBurstBalloons_452 {
    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        if (points[0] == null || points[0].length == 0) {
            return 0;
        }

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int terminal = points[0][1];
        int ans = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > terminal) {
                ans++;
                terminal = points[i][1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int ret = findMinArrowShots(points);
        System.out.print(ret);
    }
}
