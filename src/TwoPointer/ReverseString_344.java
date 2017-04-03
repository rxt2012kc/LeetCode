package TwoPointer;

/**
 * @Author RenXintao
 * @Date 3/11/17
 */
public class ReverseString_344 {
    public static String reverseString(String s) {
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
        String s = "hello";
        String ret = reverseString(s);
        System.out.print(ret);
    }
}
