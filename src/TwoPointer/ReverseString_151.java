package TwoPointer;

/**
 * @Author RenXintao
 * @Date 3/11/17
 */
public class ReverseString_151 {
    public static String reverseWords(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }

        String reverse = reverseString(s);
        String[] strArr = reverse.split(" ");
        if (strArr.length == 0 || strArr == null) {
            return "";
        }
        String ret = "";
        for(int i = 0; i < strArr.length - 1; i++) {
             ret += reverseString(strArr[i]) + " ";
        }
        ret += reverseString(strArr[strArr.length - 1]);
        return ret;
    }
    private static String reverseString(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }

        char[] array = s.toCharArray();
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return new String(array);
    }
    public static void main(String[] args) {
        String s = "1 ";
        String ret = reverseWords(s);
        System.out.print(ret);
    }
}
