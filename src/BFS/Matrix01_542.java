package BFS;



import java.util.*;

/**
 * @Author RenXintao
 * @Date 4/12/17
 */
public class Matrix01_542 {
    public static List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
        if (matrix == null || matrix.size() == 0) {
            return matrix;
        }
        if (matrix.get(0) == null || matrix.get(0).size() == 0) {
            return matrix;
        }

        int m = matrix.size();
        int n = matrix.get(0).size();
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix.get(i).get(j) == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix.get(i).set(j, Integer.MAX_VALUE);
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 上下左右
        while (!queue.isEmpty()) {
            int cell[] = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                // 下标越界继续一个方向
                if (r < 0 || r >= m || c < 0 || c >= n) {
                    continue;
                }
                int value = matrix.get(r).get(c); // 上下左右取到的值
                int temp = matrix.get(cell[0]).get(cell[1]) + 1; // 队列中取出的值＋1
                if (value <= temp) {
                    continue;
                }
                queue.offer(new int[]{r, c});
                matrix.get(r).set(c, temp);
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        List<Integer> temp1 = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
        List<Integer> temp2 = new ArrayList<Integer>(Arrays.asList(0, 1, 0));
        List<Integer> temp3 = new ArrayList<Integer>(Arrays.asList(1, 1, 1));
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(temp1);
        lists.add(temp2);
        lists.add(temp3);

        List<List<Integer>> ret = updateMatrix(lists);
        System.out.print(ret);
    }
}
