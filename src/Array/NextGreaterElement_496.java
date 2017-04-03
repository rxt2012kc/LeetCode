package Array;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author RenXintao
 * @Date 3/19/17
 */
public class NextGreaterElement_496 {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        if (findNums == null || nums == null || findNums.length > nums.length) {
            return null;
        }

        int flag = 0;
        int[] ret = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            flag = 0;
            ret[i] = -1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == findNums[i]) {
                    if (j < nums.length - 1) {
                        flag = 1;
                        continue;
                    }
                }
                if (flag == 1) {
                    if (nums[j] > findNums[i]) {
                        ret[i] = nums[j];
                        flag = 0;
                        break;
                    }
                }
            }
        }
        return ret;
    }
    public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
        if (findNums == null || nums == null || findNums.length > nums.length) {
            return null;
        }

        int[] ret = new int[findNums.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++) {
//            ret[i] = map.get(findNums[i]) != null ? map.get(findNums[i]) : -1;
            ret[i] = map.containsKey(findNums[i]) ? map.get(findNums[i]) : -1;

        }

        return ret;
    }
    public static void main(String[] args) {
        int[] findNums = {4,1,2};
        int[] nums = {1,3,4,2};
        int[] ret = nextGreaterElement2(findNums, nums);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(findNums[i] + " ");
            System.out.println(ret[i]);
        }
    }
}
