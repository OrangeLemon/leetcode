package tree;

/**
 * 有序数组转二叉搜索树
 */
public class SortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST1(0, nums.length -1 , nums);
    }

    public TreeNode sortedArrayToBST1(int from, int to, int[] nums) {
        if(to < from) return null;

        int rootIndex = ((to - from) / 2) + from;
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = sortedArrayToBST1(from, rootIndex - 1, nums);
        root.right = sortedArrayToBST1(rootIndex + 1, to, nums);
        return root;
    }

    public void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode node = sortedArrayToBST(nums);
        System.out.println(node);
    }


}
