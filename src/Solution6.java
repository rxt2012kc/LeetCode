/**
 * @Author RenXintao
 * @Date 2/26/17
 */
public class Solution6 {
    public String convert(String s, int nRows) {
        if(s == null && s.length() == 0 && nRows <= 0) {
            return "";
        }
        if(nRows == 1) {
            return s;
        }
        int size = 2 * nRows - 2;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < nRows; i++){
            for (int j = i; j < s.length(); j += size) {
                res.append(s.charAt(j));
                if(i != 0 && i != nRows - 1) {
                    int insertInt = j + size - 2 * i;
                    if (insertInt < s.length()) {
                        res.append(s.charAt(insertInt));
                    }
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
//        String s = "PAHNAPLSIIGYIR";
        String s = "PAHNAPLSIIGYIR";
        String result = s6.convert(s, 4);
        System.out.print(result);
    }
}
