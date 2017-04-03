package BitManipulation;

/**
 * @Author RenXintao
 * @Date 3/15/17
 */
public class NumberComplement_476 {
    public static int findComplement(int x) {

        int ret = ~x & (Integer.highestOneBit(x) - 1);
        return ret;
    }
    public static void main(String[] args) {
        int x = 5;
        int ret = findComplement(x);
        System.out.print(ret);

    }
}

