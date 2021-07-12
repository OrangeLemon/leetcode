package _03_tree._226_翻转二叉树;

import _03_tree.TreeNode;

public class InvertTree {
    //思路：递归地交换左右节点即可
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
