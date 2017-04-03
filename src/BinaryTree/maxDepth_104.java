package BinaryTree;

import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/14/17
 */
public class maxDepth_104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;

        return left > right ? left : right;
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);
        A.left.right = new TreeNode(5);
        int ret = maxDepth(A);
        System.out.print(ret);
    }}
