package Array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author RenXintao
 * @Date 3/25/17
 */
public class test {
    public static int[] magic(int n, int k, int[] num) {
        HashMap map = new HashMap();
        int flag = 1;
        while (k > 0) {
            flag = 1;
            int num0 = num[0];
            for (int i = 0; i < num.length - 1; i++) {
                num[i] = (num[i + 1] + num[i]) % 100;
                if (map.get(i) == num[i]) {
                    flag++;
                }
                int m = num[i];
                map.put(i, m);
                if (flag == num.length - 1) {
                    break;
                }
            }
            num[num.length - 1] = (num[num.length - 1] + num0) % 100;
            int a = num[num.length - 1];
            if (flag == num.length - 1 && map.get(num.length - 1) == num[num.length - 1]) {
                break;
            }
            map.put(num.length - 1, a);
            k--;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 499;
        int[] num = {10, 20, 30, 40, 50};
        int[] magic = magic(n, k, num);
        for (int i = 0; i < magic.length; i++) {
            System.out.println(magic[i]);
        }
    }
}
