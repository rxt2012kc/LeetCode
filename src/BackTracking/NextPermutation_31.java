//package BackTracking;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author RenXintao
// * @Date 4/1/17
// */
//public class NextPermutation_31 {
//    public static void nextPermutation(int[] nums) {
//        List<List<Integer>> permutes = new ArrayList<List<Integer>>();
//        List<Integer> permute = new ArrayList<Integer>();
//        helper(permutes, permute, nums);
//        for (int i = 0; i <  permutes.size(); i++) {
////           if (nums == permutes.get(i).toArray()) {
//
//
//           }
//        }
//    }
//    private static void helper(List<List<Integer>> permutes, List<Integer> permute, int[] nums) {
//        // 出口
//        if (permute.size() == nums.length) {
//            permutes.add(new ArrayList<Integer>(permute));
////            return;
//        }
//        // 过程
//        for (int i = 0; i < nums.length; i++) {
//            if(permute.contains(nums[i])) {
//                continue;
//            }
//            permute.add(nums[i]);
//            helper(permutes, permute, nums);
//            permute.remove(permute.size() - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
