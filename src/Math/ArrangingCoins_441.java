package Math;

/**
 * @Author RenXintao
 * @Date 4/3/17
 */
public class ArrangingCoins_441 {
    public static int arrangeCoins(int n) {
        double temp = ((-1 + Math.sqrt(1 + 8 * n)) / 2);
        int ret = (int)temp;
        return ret;
    }
    public static void main(String[] args) {
        int n = 1804289383;
        int ret = arrangeCoins(n);
        System.out.print(ret);
    }
}
