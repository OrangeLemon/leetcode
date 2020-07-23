package tree;

import java.util.ArrayList;

public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || null == p || null == q) {
            return null;
        }
        ArrayList<TreeNode> array_p = new ArrayList<>();
        ArrayList<TreeNode> array_q = new ArrayList<>();
        findAncestor(root, p, array_p);
        findAncestor(root, q, array_q);
        int size = array_p.size() > array_q.size() ? array_q.size() : array_p.size();
        for (int i = 0; i < size; i++) {
            if (array_p.get(i) == array_q.get(i) && array_p.get(i + 1) != array_q.get(i + 1)) {
                return array_p.get(i);
            }
        }
        boolean same = true;
        for (int i = 0; i < size; i++) {
            if (same && array_p.get(i) == array_q.get(i) && i == size - 1) {
                return array_p.get(i);
            }
        }
        return null;
    }

    public static boolean findAncestor(TreeNode root, TreeNode p, ArrayList<TreeNode> array) {
        if (null == root || null == p) {
            return false;
        }
        if (root == p) {
            array.add(root);
            return true;
        }
        array.add(root);
        //递归查找
        if (root.left != null && findAncestor(root.left, p, array)) {
            return true;
        }
        if (root.right != null && findAncestor(root.right, p, array)) {
            return true;
        }
        //剪枝
        array.remove(array.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Integer[] values = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode tree = TreeUtils.createFromBfsResult(values);
        TreeNode p = TreeUtils.bfs(tree, 5);
        TreeNode q = TreeUtils.bfs(tree, 4);
        lowestCommonAncestor(tree, p, q);


    }
}
