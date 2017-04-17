package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author RenXintao
 * @Date 4/10/17
 */
public class BinaryTreeLevelOrderTraversal_102 {
    // bfs
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            System.out.println(level);
            System.out.println("**");
            ret.add(level);
        }

        return ret;
    }

    // dfs
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        levelAdd(root, ret, 0);
        return ret;
    }
    private static void levelAdd(TreeNode root, List<List<Integer>> ret, int level) {
        if (root == null) {
            return;
        }

        if (ret.size() <= level) {
            ret.add(new ArrayList<Integer>());
        }
        ret.get(level).add(root.val);
        levelAdd(root.left, ret, level + 1);
        levelAdd(root.right, ret, level + 1);
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);
        A.left.right = new TreeNode(5);
        List<List<Integer>> ret = levelOrder(A);
        for (List<Integer> r : ret) {
            System.out.print(r);
        }
    }
}
