package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class Triangle_120_2 {
    private static int n;
    private static List<List<Integer>> minSum;
    private static List<List<Integer>> tri;

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }

        // state: f.get(x).get(y) = minimum path value from x,y to bottom
        // initial last row
        int len = triangle.size();
        List<List<Integer>> minSum = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 0; i < len; i++) {
            temp = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                temp.add(j, 0);
            }
            minSum.add(i, temp);
        }

        for (int j = 0; j < triangle.get(len - 1).size(); j++) {
            minSum.get(len - 1).set(j, triangle.get(len - 1).get(j));
        }
        // bottom up
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < minSum.get(i).size(); j++) {
                minSum.get(i).set(j, Math.min(minSum.get(i + 1).get(j), minSum.get(i + 1).get(j + 1))
                + triangle.get(i).get(j));
            }
        }

        return minSum.get(0).get(0);
    }
    public static int minimumTotal2(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }

        // state: f.get(x).get(y) = minimum path value from x,y to bottom
        int len = triangle.size();
        // bottom up
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j, Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1))
                        + triangle.get(i).get(j));
            }
        }

        return triangle.get(0).get(0);
    }
    public static int minimumTotal3(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }

        // state: f.get(x).get(y) = minimum path value from 0,0 to x,y

        int len = triangle.size();
        // up bottom
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    triangle.get(i).set(j, triangle.get(i - 1).get(j)
                            + triangle.get(i).get(j));
                } else if (j == i) {
                    triangle.get(i).set(j, triangle.get(i - 1).get(j - 1)
                            + triangle.get(i).get(j));
                } else {
                    triangle.get(i).set(j, Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j))
                            + triangle.get(i).get(j));
                }
            }
        }

        int best = triangle.get(len - 1).get(0);
        for (int i = 0; i < len; i++) {
            if (triangle.get(len - 1).get(i) < best)
                best = triangle.get(len - 1).get(i);

        }
        return best;
    }
    public static int minimumTotal4(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }

        // state: f.get(x).get(y) = minimum path value from x,y to bottom
        // initial new list
        int len = triangle.size();
        List<List<Integer>> minSum = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 0; i < len; i++) {
            temp = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                temp.add(j, 0);
            }
            minSum.add(i, temp);
        }

        // initial
        minSum.get(0).set(0, triangle.get(0).get(0));
        for (int i = 1; i < len; i++) {
            minSum.get(i).set(0, minSum.get(i - 1).get(0) + triangle.get(i).get(0));
            minSum.get(i).set(i, minSum.get(i - 1).get(i - 1) + triangle.get(i).get(i));
        }
        // up bottom
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < i; j++) {
                minSum.get(i).set(j, Math.min(minSum.get(i - 1).get(j - 1), minSum.get(i - 1).get(j))
                        + triangle.get(i).get(j));
            }
        }

        int best = minSum.get(len - 1).get(0);
        for (int i = 0; i < len; i++) {
            if (minSum.get(len - 1).get(i) < best)
                best = minSum.get(len - 1).get(i);

        }
        return best;
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
        int r = minimumTotal3(ret);
        System.out.print(r);
    }
}
