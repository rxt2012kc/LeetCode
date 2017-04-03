package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class PascalTriangleII_119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0)
            return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<Integer> ret = getRow(numRows);
        System.out.print(ret);
    }
}
