package String;

/**
 * @Author RenXintao
 * @Date 3/29/17
 */
public class TrailingZeroes_172 {
    public static int trailingZeroes(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        while (n > 0) {
            sum += n / 5;
            n = n / 5;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int ret = trailingZeroes(n);
        System.out.print(ret);
    }
}
