package BinaryTree;

/**
 * @Author RenXintao
 * @Date 3/15/17
 */
public class SymmetricTree_101 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }
    public static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left == right) {
            return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(0);
//        A.left = new TreeNode(2);
//        A.right = new TreeNode(3);
//        A.left.left = new TreeNode(4);
//        A.left.right = new TreeNode(5);
        TreeNode B = new TreeNode(1);
//        B.left = new TreeNode(2);
//        B.right = new TreeNode(3);
//        B.left.left = new TreeNode(4);
//        B.left.right = new TreeNode(5);
        boolean ret = isSymmetric(A);
        System.out.print(ret);
    }

}
