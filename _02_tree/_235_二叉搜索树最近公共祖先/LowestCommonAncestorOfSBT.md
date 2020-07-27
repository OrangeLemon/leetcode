# 二叉搜索树的最近公共祖先【简单】
<https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/>

## 知识点
- 递归
- 二叉搜索树
 
## 思路
 1. 递归
 2. 若p和q的值都比root小，搜索左子树；若p和q的值都比root大，搜索右子树；否则返回root；
## 边界
 
## code
[LowestCommonAncestorOfSBT.java](LowestCommonAncestorOfSBT.java)

**Complexity Anlysis**

 - 时间：O(N)
 - 空间：O(N)
