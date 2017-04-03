/**
 * @Author RenXintao
 * @Date 2/27/17
 */
public class Solution7 {
    public static int reverse(int x) {
        long temp = 0;
        long result = 0;
        while (x != 0) {
            temp = result * 10 + x % 10;
            // 判断是否越界
//            if(temp / 10 != result) {
//                return 0;
//            }
            if(temp > Integer.MAX_VALUE) {
                return 0;
            }
            x = x / 10;
            result = temp;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int param = -1234222223;
        int result = reverse(param);
        System.out.print(result);
    }
}
