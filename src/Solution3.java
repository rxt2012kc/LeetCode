import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author RenXintao
 * @Date 2/10/17
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int index = 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        for(int i = 0; i < s.length(); i++) {
//            index = 0;
//            for (int j = i; j < s.length(); j++) {
//                if (!map.containsKey(s.charAt(j))) {
//                    index++;
//                } else {
//                    map.clear();
//                    break;
//                }
//                map.put(s.charAt(j), j);
//                if (result < index) {
//                    result = index;
//                }
//            }
//        }
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
//                j = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), i);
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String test = "abba";
        int ret = s.lengthOfLongestSubstring(test);
        System.out.print(ret);

    }
}
