import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @Author RenXintao
 * @Date 3/6/17
 * @Time O(nk) @Space O(n)
 */
public class Solution202 {
    public static boolean isHappy(int n) {
        if(n <= 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        int sum;
        while (set.add(n)) {
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }

        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        boolean is = isHappy(n);
        System.out.print(is);
    }
}
