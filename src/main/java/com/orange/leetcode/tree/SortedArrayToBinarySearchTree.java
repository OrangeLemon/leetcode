package com.orange.leetcode.tree;

/**
 * 有序数组转二叉搜索树
 */
public class SortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(0, nums.length -1 , nums);
    }

    public TreeNode arrayToBST(int from, int to, int[] nums) {
        if(to < from) return null;

        int rootIndex = ((to - from) / 2) + from;
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = arrayToBST(from, rootIndex - 1, nums);
        root.right = arrayToBST(rootIndex + 1, to, nums);
        return root;
    }

    public static void main(String[] args) {
        SortedArrayToBinarySearchTree sort = new SortedArrayToBinarySearchTree();
        int[] nums = {-10,-3,0,5,9};
        TreeNode node = sort.sortedArrayToBST(nums);
        System.out.println(node);
    }


}
