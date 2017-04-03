/**
 * @Author RenXintao
 * @Date 2/27/17
 */
public class Solution9 {
    public static boolean isPalindrome(int x) {
//        if(x < 0) {
//            return false;
//        }
//        int n = x;
//        int temp = 0;
//        int result = 0;
//        while (n != 0) {
//            temp = result * 10 + n % 10;
//            // 判断是否越界
//            if(temp / 10 != result) {
//                return false;
//            }
//            n = n / 10;
//            result = temp;
//        }
//        if(result == x) {
//            return true;
//        } else {
//            return false;
//        }
        if (x < 0)
            return false;

        // initialize how many zeros
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;
            int right = x % 10;

            if (left != right)
                return false;

            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }

    public static void main(String[] args) {
        int param = 24342;
        boolean result = isPalindrome(param);
        System.out.print(result);
    }
}
