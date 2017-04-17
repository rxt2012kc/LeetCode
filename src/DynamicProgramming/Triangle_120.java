package DynamicProgramming;
import java.util.*;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class Triangle_120 {
    private static int n;
    private static int best = Integer.MAX_VALUE;
    private static List<List<Integer>> minSum = null;
    private static Map<String, Integer> map = new HashMap<String, Integer>();
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }
        n = triangle.size();
        minSum = triangle;
//        traverse(0, 0, 0);
//        return best;
        int ret = memorySearch(0, 0);
        return ret;
    }
    // traverse 找到所有的路径进行比较sum，找出最小的sum @time: 2^n ：1变2，2变4，4变8
    private static void traverse(int x, int y, int sum) {
        if (x == n) {
            if (sum < best) {
                best = sum;
            }
            return;
        }

        traverse(x + 1, y, sum + minSum.get(x).get(y));
        traverse(x + 1, y + 1, sum + minSum.get(x).get(y));
    }
    // 分治方法 找出了从x，y出发，走到最底层的最小路径的长度
    private static int dfs(int x, int y) {
        if (x == n) {
            return 0;
        }
        int leftSum = dfs(x + 1, y);
        int rightSum = dfs(x + 1, y + 1);
        return Math.min(leftSum, rightSum) + minSum.get(x).get(y);
    }
    public static int minimumTotal1(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
            return -1;
        }
        n = triangle.size();
        minSum = triangle;

        int ret = memorySearch(0, 0);
        return ret;
    }
    private static int memorySearch(int x, int y) {
        if (x == n) {
            return 0;
        }
        if (map.containsKey(x + "" + y)){
            return map.get(x + "" + y);
        }
        int leftSum = memorySearch(x + 1, y);
        int rightSum = memorySearch(x + 1, y + 1);
        int ret = Math.min(leftSum, rightSum) + minSum.get(x).get(y);
        map.put(x + "" + y, ret);
        return map.get(x + "" + y);
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
        int r = minimumTotal1(ret);
        System.out.print(r);
    }
}
