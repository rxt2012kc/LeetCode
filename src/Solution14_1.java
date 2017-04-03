/**
 * @Author RenXintao
 * @Date 3/1/17
 */
public class Solution14_1 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) {
            return "";
        }
        String result = strs[0];
        for(int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] param = {"c","acc","ccc"};
        String result = longestCommonPrefix(param);
        System.out.println(result);
        System.out.print("aabb".indexOf("aa"));
    }
}
