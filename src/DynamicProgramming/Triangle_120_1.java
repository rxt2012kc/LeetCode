package DynamicProgramming;
import java.util.*;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class Triangle_120_1 {
    private static int n;
    private static List<List<Integer>> minSum;
    private static List<List<Integer>> tri;

    private static int search(int x, int y) {
        if (x >= n) {
            return 0;
        }

        if (minSum.get(x).get(y) != Integer.MAX_VALUE) {
            return minSum.get(x).get(y);
        }

        minSum.get(x).set(y, Math.min(search(x + 1, y), search(x + 1, y + 1))
                + tri.get(x).get(y));
        return minSum.get(x).get(y);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }

        n = triangle.size();
        tri = triangle;
        minSum = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 0; i < n; i++) {
            temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(j, Integer.MAX_VALUE);
            }
            minSum.add(i, temp);
        }

        return search(0, 0);
    }

    public static void main(String[] args) {
        List<Integer> temp1 = new ArrayList<>(Arrays.asList(2));
        List<Integer> temp2 = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> temp3 = new ArrayList<>(Arrays.asList(6, 5, 7));
        List<Integer> temp4 = new ArrayList<>(Arrays.asList(4, 1, 8, 3));
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(temp1);
        ret.add(temp2);
        ret.add(temp3);
        ret.add(temp4);
        int r = minimumTotal(ret);
        System.out.print(r);
    }
}
