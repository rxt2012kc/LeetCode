import java.util.*;

/**
 * @Author RenXintao
 * @Date 3/1/17
 */

public class Solution15_0 {
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 && nums == null) {
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            int j = i + 1;
            int k = nums.length - 1;
            if(i != 0 && (i > 0 && nums[i] == nums[i - 1])) {
                i++;
            } else {
                while (j < k) {
                    List<Integer> temp = new ArrayList<>();
                    while (nums[i] + nums[j] + nums[k] < 0 && j < k) {
                        j++;
                    }
                    while (nums[i] + nums[j] + nums[k] > 0 && j < k) {
                        k--;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0 && j < k) {
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    }
                }
                i++;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] param = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(param);
//        for(List<Integer> ret : result) {
//            for (Integer r : ret) {
//                System.out.print("," + r);
//            }
//        }
        System.out.print(result);
    }
}
