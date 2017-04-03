/**
 * @Author RenXintao
 * @Date 3/1/17
 */
public class Solution11_2 {
    public static int maxArea(int[] height) {
        int mxArea = 0;
        int left = 0, right = height.length - 1;
        int flag_left, flag_right;
        while(left < right) {
            int curArea = Math.min(height[left], height[right]) * (right-left);
            mxArea = Math.max(curArea, mxArea);
            if(height[left] < height[right]) {
                flag_left = height[left++];
                while (height[left] < flag_left && left < right) {
                    left++;
                }
            } else {
                flag_right = height[right--];
                while (height[right] < flag_right && left < right) {
                    right--;
                }
            }
        }
        return mxArea;
    }
    public static void main(String[] args) {
        int[] param = {1,5,3,4,1,2,3,4};
        int result = maxArea(param);
        System.out.print(result);
    }
}
