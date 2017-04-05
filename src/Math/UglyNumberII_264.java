package Math;

import java.util.*;

/**
 * @Author RenXintao
 * @Date 4/3/17
 */
public class UglyNumberII_264 {
    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            ugly[i] = min;
            if (min == factor2) {
                factor2 = 2 * ugly[++index2];
            }
            if (min == factor3) {
                factor3 = 3 * ugly[++index3];
            }
            if (min == factor5) {
                factor5 = 5 * ugly[++index5];
            }
            System.out.print("\n");
        }

        return ugly[n - 1];
    }
    public static int nthUglyNumber2(int n) {
        if(n <= 0) return -1; // get rid of corner cases
        if(n == 1) return 1; // base case

        int t2 = 0, t3 = 0, t5 = 0; //pointers for 2, 3, 5
        int[] k = new int[n];
        k[0] = 1;
        for(int i  = 1; i < n ; i ++)
        {
            k[i] = Math.min(k[t2] * 2, Math.min(k[t3] * 3,k[t5] * 5));
            if(k[i] == k[t2] * 2) t2++;
            if(k[i] == k[t3] * 3) t3++;
            if(k[i] == k[t5] * 5) t5++;
        }

        return k[n-1];
    }
    public static void main(String[] args) {
        int n = 20;
        int ret = nthUglyNumber(n);
        System.out.print(ret);
    }
}
