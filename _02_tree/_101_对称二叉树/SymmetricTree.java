package _02_tree._101_对称二叉树;

import _02_tree.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(null == root) return true;
        return isSymmetricRecursion(root.left, root.right);

    }
    boolean isSymmetricRecursion(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return (left.val == right.val) && isSymmetricRecursion(left.left, right.right) &&  isSymmetricRecursion(left.right, right.left);
    }
}
