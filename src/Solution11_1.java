/**
 * @Author RenXintao
 * @Date 3/1/17
 */
public class Solution11_1 {
    public static int maxArea(int[] height) {
        int mxArea = 0;
        int left = 0, right = height.length - 1;
        int flag = 0;
        while (left < right) {
            int curArea = Math.min(height[left], height[right]) * (right - left);
            flag++;
            mxArea = Math.max(curArea, mxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("flag = " + flag);
        return mxArea;
    }

    public static void main(String[] args) {
        int[] param = {1, 2, 3, 4, 1, 2, 3, 4};
        int result = maxArea(param);
        System.out.print(result);

    }
}
