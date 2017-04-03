package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class Sqrt_69 {
    public static int mySqrt(int x) {
        if (x < 0) {
            return -1;
        }
        // if (x == 0) {
        //     return 0;
        // }

        long start = 1;
        long end = x;
        long mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (end * end <= x) {
            return (int)end;
        }

        return (int)start;
    }
    public static void main(String[] args) {
        int x = 0;
        int ret = mySqrt(x);
//        double ret = Math.pow(10,2);
        System.out.print(ret);
    }
}
