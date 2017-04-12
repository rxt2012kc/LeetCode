package Sort;

import java.util.Arrays;

/**
 * @Author RenXintao
 * @Date 4/10/17
 */
public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] != tChar[i]) {
                return false;
            }
        }

        return true;
    }
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[256];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            count[sChar[i] - 'a']++;
            count[tChar[i] - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "cab";
        boolean ret = isAnagram2(s, t);
        System.out.println(ret);
    }

}
