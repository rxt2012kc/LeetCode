package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/5/17
 */
public class Solution46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutes = new ArrayList<List<Integer>>();
        List<Integer> permute = new ArrayList<Integer>();
        helper(permutes, permute, nums);
        return permutes;

    }
    private static void helper(List<List<Integer>> permutes, List<Integer> permute, int[] nums) {
        // 出口
        if (permute.size() == nums.length) {
            permutes.add(new ArrayList<Integer>(permute));
//            return;
        }
        // 过程
        for (int i = 0; i < nums.length; i++) {
            if(permute.contains(nums[i])) {
                continue;
            }
            permute.add(nums[i]);
            helper(permutes, permute, nums);
            permute.remove(permute.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        List<List<Integer>> permutes = permute(nums);
        System.out.println(permutes);

    }
}
