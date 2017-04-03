/**
 * @Author taotao
 * @Date 3/7/17
 * @Time O(1) @Space O(1)
 */
public class Solution263 {
    public static boolean isUgly(int num) {
        boolean ret = false;
        if (num < 0) {
            return ret;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
    public static void main(String[] args) {
        int num = 6;
        boolean ret = isUgly(num);
        System.out.print(ret);
    }
}
