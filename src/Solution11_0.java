import java.util.Arrays;

/**
 * @Author RenXintao
 * @Date 2/27/17
 */
// 暴力解法，超时，没有ac通过
public class Solution11_0 {
    public static int maxArea(int[] height) {
        int result = 0;
        int minHeight;
        int max_i = 0, max_j = 0;
        for(int i = 0; i < height.length; i++) {
            if(max_i <= height[i]) {
                max_i = height[i];
            } else {
                continue;
            }
            max_j = 0;
            for (int j = height.length - 1; j > i; j--) {
                if(max_j <= height[j]) {
                    max_j = height[j];
                } else {
                    continue;
                }
                if(height[i] <= height[j]) {
                    minHeight = height[i];
                }
                else {
                    minHeight = height[j];
                }
                if(result < minHeight * (j - i)) {
                    result = minHeight * (j - i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] param = {1,2,4,3};
        int result = maxArea(param);
        System.out.print(result);
    }
}
