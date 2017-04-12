package Sort;


import java.util.*;

/**
 * @Author RenXintao
 * @Date 4/3/17
 * @Time O(n)
 * @Space O(n)
 */
public class IntersectionOfTwoArraysII_350 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
            return nums1;
        }
        if (nums2 == null || nums2.length == 0) {
            return nums2;
        }
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }

        int size = list.size();
        int[] ret = new int[size];
        int k = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            ret[k++] = it.next();
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2};
        int[] nums2 = {1,2,2};
        int[] ret = intersection(nums1, nums2);
        for (int i : ret) {
            System.out.println(i);
        }
    }
}
