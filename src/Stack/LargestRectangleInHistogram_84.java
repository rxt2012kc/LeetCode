package Stack;

import java.util.Stack;

/**
 * @Author RenXintao
 * @Date 4/6/17
 */
public class LargestRectangleInHistogram_84 {
    public static int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for (int i = 0; i <= heights.length; i++) {
            int curHeight = i == heights.length ? 0 : heights[i];
            while (!stack.empty() && curHeight <= heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.empty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }

        return max;
    }
    public static void main(String[] args) {
//        int[] heights = {2, 1, 5, 6, 2, 3};
        int[] heights = {1, 1};
        int ret = largestRectangleArea(heights);
        System.out.print(ret);
    }
}
