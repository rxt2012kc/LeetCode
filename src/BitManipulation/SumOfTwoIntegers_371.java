package BitManipulation;

/**
 * @Author RenXintao
 * @Date 4/5/17
 */
public class SumOfTwoIntegers_371 {
    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
    public static void main(String[] args) {
        int ret = getSum(3, 5); // 0011 0101
        System.out.print(ret);
    }
}
