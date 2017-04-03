/**
 * @Author RenXintao
 * @Date 2/28/17
 */
public class Solution8 {
    public static int myAtoi(String str) {
        // with leading and trailing whitespace omitted.
        str = str.trim();
        if(str == "" || str.length() == 0) {
            return 0;
        }
        // index 标记是否有'+','-'号，有的话index++
        int index = 0;
        int flag = 1;
        // result为long型，判断是否出界
        long result = 0;
        if(str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            index++;
            flag = -1;
        }
        for(; index < str.length(); index++) {
            if(str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                result = result * 10 + str.charAt(index) - '0';
                if(result > Integer.MAX_VALUE) {
                    break;
                }
            } else {
                break;
            }
        }
        if(flag * result >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if(flag * result <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)(flag * result);
    }

    public static void main(String[] args) {
        String param = "-2147483649";
        int result = myAtoi(param);
        System.out.print(result);
    }
}

