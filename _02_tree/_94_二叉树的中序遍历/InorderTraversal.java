package _02_tree._94_二叉树的中序遍历;

import _02_tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InorderTraversal {

    //方法一：递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if(null == root) return Collections.emptyList();
        List<Integer> result = new ArrayList<>();
        if(null != root.left) {
            result.addAll(inorderTraversal(root.left));
        }
        result.add(root.val);
        if(null != root.right) {
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

    //方法二：递归
    public List<Integer> inorderTraversal_v2(TreeNode root) {
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



    //方法三：迭代
    public List<Integer> inorderTraversal_v3(TreeNode root) {
        return null;
    }

}
