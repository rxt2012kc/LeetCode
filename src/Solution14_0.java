/**
 * @Author RenXintao
 * @Date 3/1/17
 */
public class Solution14_0 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        int flag = 0;
        int flag1 = 1;
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
                flag = i;
            }
        }
        String result = "";
        for(int j = 0; j < minLength; j++) {
            for(int z = 0; z < strs.length; z++) {
                if(strs[z].charAt(j) != strs[flag].charAt(j)) {
                    flag1 = 0;
                    break;
                }
            }
            if(flag1 == 0) {
                break;
            }
            result += strs[flag].charAt(j);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] param = {"aabb", "aabc", "aa"};
        String result = longestCommonPrefix(param);
        System.out.print(result);
    }
}
