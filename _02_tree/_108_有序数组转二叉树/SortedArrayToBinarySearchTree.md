# 有序数组转二叉搜索树【简单】
 <https://leetcode-cn.com/problems/convert-sorted-_01_array-to-binary-search-_02_tree/>
 
 ## 知识点
 - 有序数组：[1,2,3,4,5]
 - 二叉搜索树：二叉树，左子节点 < 根节点 < 右子节点 
 
## 思路
1. 中序遍历逆过程。
2. 递归实现，求每一个节点的左子节点&右子节点，返回根节点。
3. 算法描述：
    - 根节点：子数组的中间节点，rootIndex = left + (right-left)/2 ;
    - 左子节点：left=left，right=rootIndex-1;
    - 右子节点：left=rootIndex + 1，right=right;
 4. 结束条件：right < left，方法内先判断，不符合直接return null;
  
## 边界

## code
 [SortedArrayToBinarySearchTree.java](SortedArrayToBinarySearchTree.java)

 
**Complexity Anlysis**
 - 时间：O(n)
 - 空间：O(logn)

## 其他
该题答案不唯一
 
 

 
 
 

    

