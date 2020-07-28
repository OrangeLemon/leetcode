package _02_tree._102_二叉树的层序遍历;

import _02_tree.TreeNode;

import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(null == root) return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> result = new ArrayList<>();
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> rows = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                rows.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(rows);

        }
        return result;
    }
}
