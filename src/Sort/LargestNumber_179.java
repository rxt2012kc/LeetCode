package Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author RenXintao
 * @Date 4/5/17
 */
public class LargestNumber_179 {
    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        String[] s = new String[nums.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = nums[i] + "";
//            s[i] = String.valueOf(nums[i]);
        }
        // sort
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.print("o1 = " + o1 + ", o2 = " + o2 + " ");
                System.out.print("ret = " + (o1 + o2).compareTo(o2 + o1));
                System.out.print("\n");
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        // merge
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res = res + s[i];
        }
        if (s[0].charAt(0) == '0') {
            res = "0";
        }

        return res;
    }
    public static String largestNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        // Convert int array to String array, so we can sort later on
        String[] s_num = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            s_num[i] = String.valueOf(nums[i]);

        // Comparator to decide which string should come first in concatenation
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1); // reverse order here, so we can do append() later
            }
        };

        Arrays.sort(s_num, comp);
        // An extreme edge case by lc, say you have only a bunch of 0 in your int array
        if(s_num[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String s: s_num)
            sb.append(s); // add later 5 --> 534

        return sb.toString();
    }
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 0};
//        int[] nums = {90, 0};
        String ret = largestNumber2(nums);
        System.out.print(ret);
    }
}
