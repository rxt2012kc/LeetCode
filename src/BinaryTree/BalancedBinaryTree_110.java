package BinaryTree;

/**
 * @Author RenXintao
 * @Date 3/14/17
 */
public class BalancedBinaryTree_110 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        }
        if (!left || !right) {
            return false;
        }

        return true;
    }
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
        A.left.left.left = new TreeNode(6);
        boolean ret = isBalanced(A);
        System.out.print(ret);
    }}
