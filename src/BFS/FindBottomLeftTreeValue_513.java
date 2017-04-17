package BFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author RenXintao
 * @Date 4/13/17
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class FindBottomLeftTreeValue_513 {
    // 每层从右往左遍历
    public static int findBottomLeftValue(TreeNode root) {
        int ret = -1;
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode temp = null;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.right != null) {
                queue.offer(temp.right);
            }
            if (temp.left != null) {
                queue.offer(temp.left);
            }
        }

        return temp.val;
    }
    // 记录每层的第一个结点
    public static int findBottomLeftValue2(TreeNode root) {
        int ret = -1;
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ret = queue.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        return ret;
    }

    // dfs
    public static int findBottomLeftValue3(TreeNode root) {
        int[] result = new int[]{0, root.val};
        find(root, 0, result);
        return result[1];
    }
    private static void find(TreeNode root, int level, int[] result) {
        if (root == null) {
            return;
        }

        if (level > result[0]) {
            result[0] = level;
            result[1] = root.val;
        }
        find(root.left, level + 1, result);
        find(root.right, level + 1, result);
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);
        A.left.right = new TreeNode(5);
        A.right.left = new TreeNode(6);
        A.right.right = new TreeNode(7);
        int ret = findBottomLeftValue3(A);
        System.out.print(ret);
    }
}
