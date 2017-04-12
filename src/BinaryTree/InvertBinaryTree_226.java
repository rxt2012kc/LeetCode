package BinaryTree;

import Array.PascalTriangle_118;

/**
 * @Author RenXintao
 * @Date 3/15/17
 */
public class InvertBinaryTree_226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
//        A.left.left = new TreeNode(4);
//        A.left.right = new TreeNode(5);
//        TreeNode B = new TreeNode(1);
//        B.left = new TreeNode(2);
//        B.right = new TreeNode(3);
//        B.left.left = new TreeNode(4);
//        B.left.right = new TreeNode(5);
        TreeNode ret = invertTree(A);
        System.out.print(ret.val);
    }

}
