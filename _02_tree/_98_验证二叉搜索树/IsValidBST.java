package _02_tree._98_验证二叉搜索树;

import _02_tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsValidBST {
    //深度优先遍历-中序，判断遍历的下一个节点一直比前一个节点大，否则返回false；
    public boolean isValidBST(TreeNode root) {
        List<Integer> result = inorderTraversal(root);
        for(int i =0;i<result.size() -1 ;i++) {
            if(result.get(i) >= result.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if(null == root) return Collections.emptyList();
        List<Integer> result = new ArrayList<>();
        inorderTraversalInner(root, result);
        return result;
    }
    void inorderTraversalInner(TreeNode root, List<Integer> result) {
        if(null == root) return;
        if(null != root.left) {
            inorderTraversalInner(root.left, result);
        }
        result.add(root.val);
        if(null != root.right) {
            inorderTraversalInner(root.right, result);
        }
    }
}
