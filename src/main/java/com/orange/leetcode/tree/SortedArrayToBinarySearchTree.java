package com.orange.leetcode.tree;

/**
 * 有序数组转二叉搜索树
 */
public class SortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(0, nums.length -1 , nums);
    }

    public TreeNode arrayToBST(int left, int right, int[] nums) {
        if(right < left) return null;

        int rootIndex = ((right - left) / 2) + left;
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = arrayToBST(left, rootIndex - 1, nums);
        root.right = arrayToBST(rootIndex + 1, right, nums);
        return root;
    }

    public static void main(String[] args) {
        SortedArrayToBinarySearchTree sort = new SortedArrayToBinarySearchTree();
        int[] nums = {-10,-3,0,5,9};
        TreeNode node = sort.sortedArrayToBST(nums);
        System.out.println(node);
    }


}
