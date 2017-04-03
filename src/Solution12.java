/**
 * @Author RenXintao
 * @Date 3/1/17
 */
public class Solution12 {
    public static String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[num/100%10] + X[num/10%10] + I[num%10];
    }
    public static void main(String[] args) {
        int param = 1234;
        String result = intToRoman(param);
        System.out.print(result);
    }
}
