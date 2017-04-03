package BinaryTree;

/**
 * @Author RenXintao
 * @Date 3/15/17
 */
public class SameTree_100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return (left && right);
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
        boolean ret = isSameTree(A, B);
        System.out.print(ret);
    }

}
