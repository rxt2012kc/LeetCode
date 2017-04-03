package BinarySearch;

/**
 * @Author RenXintao
 * @Date 4/2/17
 */
public class TwoSumII_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int index;
        if (numbers == null || numbers.length == 0) {
            return ret;
        }
        if (numbers.length == 2) {
            ret[0] = 1;
            ret[1] = 2;
            return ret;
        }
        int start = 0;
        int end = numbers.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (numbers[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        int i = 0;
        int j = end;
        while (i <= j) {
            if (numbers[i] + numbers[j] == target) {
                ret[0] = i + 1;
                ret[1] = j + 1;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return ret;
    }
    public static void main(String[] args) {
        int[] nums = {-3, 3, 4, 90};
        int target = 0;
        int[] ret = twoSum(nums, target);
        System.out.print(ret[0] + ", " + ret[1]);
    }
}
