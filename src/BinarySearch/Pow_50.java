package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class Pow_50 {
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        double t = myPow(x,n / 2);
        if (n % 2 != 0) {
            return n < 0 ? 1 / x * t * t : x * t * t;
        }
        else return t * t;
    }
    public static void main(String[] args) {
        double x = 2.5;
        int n = 6;
        double ret = myPow(x, n);
//        double ret = Math.pow(10,2);
        System.out.print(ret);
    }
}
