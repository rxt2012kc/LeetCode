package BinaryTree;

/**
 * @Author RenXintao
 * @Date 3/15/17
 */
public class InvertBinaryTree_226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTreeHelper(root.left, root.right);
        return root;
    }
    public static void invertTreeHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return;
        }

        invertTreeHelper(left.left, right.right);
        invertTreeHelper(left.right, right.left);

        TreeNode temp = left;
        left = right;
        right = temp;
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
