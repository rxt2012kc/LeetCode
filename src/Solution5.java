/**
 * @Author RenXintao
 * @Date 2/26/17
 */
public class Solution5 {
    private int start, maxLen;

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            doPalindrome(s, i, i);
            doPalindrome(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }

    public void doPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            start = j + 1;
            maxLen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        String s = "abba";
        String result = s5.longestPalindrome(s);
        System.out.print(result);
    }
}
