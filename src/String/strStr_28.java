package String;

/**
 * @Author RenXintao
 * @Date 3/21/17
 */
public class strStr_28 {
    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }

        int i, j;
        for (i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                   break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "abcd";
        String needle = "cd";
        int ret = strStr(haystack, needle);
        System.out.print(ret);
    }
}
