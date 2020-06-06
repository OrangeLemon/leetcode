package com.orange.leetcode.tree;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树最大深度
 */
public class MaxDepthOfBinaryTree {
    /**
     * 递归，DFS，时间 O(n),空间O(log n ~ n)
     *
     * @param root
     * @return
     */
    public int maxDepth_recursion(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth_recursion(root.left), maxDepth_recursion(root.right)) + 1;
    }

    /**
     * 迭代，dfs，stack，时间 O(n),空间O(log n ~ n)
     *
     * @param root
     * @return
     */
    public int maxDepth_iterator_dfs(TreeNode root) {
        if (null == root) {
            return 0;
        }
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));
        int depth = 1;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> top = stack.pop();
            depth = Math.max(depth, top.getValue());
            TreeNode node = top.getKey();
            if (node.left != null) {
                stack.push(new Pair<>(node.left, top.getValue() + 1));
            }
            if (node.right != null) {
                stack.push(new Pair<>(node.right, top.getValue() + 1));
            }
        }
        return depth;

    }

    /**
     * 迭代，bfs，queue，时间 O(n),空间O(n)
     *
     * @param root
     * @return
     */
    public int maxDepth_iterator_bfs(TreeNode root) {
        if (null == root) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            //注意！！！此处不能直接用queue.size()作为循环条件，因为循环过程中queue.size()会发生改变？？
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = ((LinkedList<TreeNode>) queue).pop();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        MaxDepthOfBinaryTree maxDepthOfBinaryTree = new MaxDepthOfBinaryTree();
        TreeNode root = new TreeNode(0);
        //……


        maxDepthOfBinaryTree.maxDepth_recursion(root);
        maxDepthOfBinaryTree.maxDepth_iterator_bfs(root);
        maxDepthOfBinaryTree.maxDepth_iterator_dfs(root);

    }

}
