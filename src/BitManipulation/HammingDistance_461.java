package BitManipulation;

/**
 * @Author RenXintao
 * @Date 3/15/17
 */
public class HammingDistance_461 {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    public static void main(String[] args) {
        int x = 4, y = 1;
        int ret = hammingDistance(x, y);
        System.out.print(ret);

    }
}

