package BinaryTree;

/**
 * @Author RenXintao
 * @Date 3/14/17
 */
public class LowestCommonAncestorBinarySearchTree_235 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (root.val < p.val && root.val < q.val) {
            root = root.right;
        } else if (root.val > p.val && root.val > q.val) {
            root = root.left;
        }
        if (root == null) {
            return root;
        }
        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);


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
    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        TreeNode result = root;
        if (root.val < p.val && root.val < q.val) {
            result = lowestCommonAncestor2(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            result = lowestCommonAncestor2(root.left, p, q);
        } else {
            result = root;
        }
        return result;
    }
    public static TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (root.val < p.val && root.val < q.val) {
            root = root.right;
        } else if (root.val > p.val && root.val > q.val) {
            root = root.left;
        } else {
            return root;
        }
        if (root == null) {
            return root;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor3(root.left, p, q);
        TreeNode right = lowestCommonAncestor3(root.right, p, q);

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
        TreeNode A = new TreeNode(5);
        A.left = new TreeNode(3);
        A.right = new TreeNode(7);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(4);
        TreeNode ret = lowestCommonAncestor3(A, A.left.left, A.left.right);
        System.out.print(ret.val);
    }}
