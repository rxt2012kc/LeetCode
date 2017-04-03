package BinaryTree;

/**
 * @Author RenXintao
 * @Date 3/14/17
 */
public class LowestCommonAncestor_236 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (root == p || root == q) {
            return root;
        }
        if (left != null && right !=null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);
        A.left.right = new TreeNode(2);
        TreeNode ret = lowestCommonAncestor(A, A.left, A.left.right);
        System.out.print(ret.val);
    }}
