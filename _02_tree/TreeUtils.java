package _02_tree;

import java.util.LinkedList;

public class TreeUtils {

    /**
     * 构建一棵树，入参为广度遍历结果，中间节点为空时，要传入null值；
     * @param values values
     * @return root
     */
    public static TreeNode createFromBfsResult(Integer[] values) {
        if (null == values || values.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode curRoot = queue.poll();
            if (null == curRoot) {
                continue;
            }
            TreeNode left, right;
            left = null != values[i] ? new TreeNode(values[i]) : null;
            i++;
            curRoot.left = left;
            queue.add(left);

            if (i < values.length) {
                right = null != values[i] ? new TreeNode(values[i]) : null;
                i++;
                queue.add(right);
                curRoot.right = right;
            }
        }
        return root;
    }


    public static TreeNode bfs(TreeNode root, Integer value) {
        if(root == null || value == null) {
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.pop();
            if(value.equals(curNode.val)) {
                return curNode;
            }
            addIfNotNull(queue, curNode.left);
            addIfNotNull(queue, curNode.right);
        }
        return null;
    }

    private static void addIfNotNull(LinkedList<TreeNode> queue, TreeNode node) {
        if (node != null) {
            queue.add(node);
        }
    }


}
