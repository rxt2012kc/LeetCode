package BackTracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @Author RenXintao
 * @Date 3/8/17
 */
public class Solution90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(subsets, subset, nums, 0);
        return subsets;
    }
    private static void helper(List<List<Integer>> subsets,
                               List<Integer> subset,
                               int[] nums,
                               int index
                               ) {
        subsets.add(new ArrayList<Integer>(subset));

        for(int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            helper(subsets, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        List<List<Integer>> subsets = subsetsWithDup(nums);
        System.out.print(subsets);
    }
}
