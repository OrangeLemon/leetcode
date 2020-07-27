package _02_tree._235_二叉搜索树最近公共祖先;

import _02_tree.TreeNode;

public class LowestCommonAncestorOfSBT {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p.val > root.val && q.val >root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;

    }
}
