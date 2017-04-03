package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class PascalTriangle_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return ret;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> row =  new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(new ArrayList<Integer>(row));
        }

        return ret;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ret = generate(numRows);
        System.out.print(ret);
    }
}
