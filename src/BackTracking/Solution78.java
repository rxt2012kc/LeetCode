package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/5/17
 */
public class Solution78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        if(nums == null || nums.length == 0 ) {
            return results;
        }

        Arrays.sort(nums);

        helper(results, subset, nums, 0);

        return results;
    }
    private static void helper(List<List<Integer>> results,
                        List<Integer> subset,
                        int[] nums,
                        int startIndex) {

        results.add(new ArrayList<Integer>(subset));

//        if(startIndex == nums.length) {
//            return;
//        }

        for (; startIndex < nums.length; startIndex++) {
            subset.add(nums[startIndex]);
            helper(results, subset, nums, startIndex + 1);
            subset.remove(subset.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<List<Integer>> results =  subsets(nums);
//        for(List<Integer> result : results) {
//            for (Integer r : result) {
//                System.out.println(r);
//            }
//        }
        System.out.println(results);

    }
}
