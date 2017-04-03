package Math;

/**
 * @Author RenXintao
 * @Date 3/30/17
 */
public class PowerOfThree_326 {
    public static boolean isPowerOfThree(int n) {
        double a = Math.log10(n);
        double b = Math.log10(3);
        double ret = a / b;
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
    public static void main(String[] args) {
        int n = 28;
        boolean ret = isPowerOfThree(n);
        System.out.print(ret);
    }
}
