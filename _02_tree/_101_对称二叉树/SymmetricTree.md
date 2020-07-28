# 对称二叉树【简单】
<https://leetcode-cn.com/problems/symmetric-tree/>

## 知识点
- 实现递归的第一步，先找到子问题。
 
## 思路
 1. 对称二叉树的子问题，即 左子树=右子树 && 左子树的左节点==右子树的右节点 && 左子树的右节点==右子树的左节点。
 2. 将子问题作为一个单独的函数，迭代调用，从上到下遍历，从下到上返回。
 3. 迭代实现：用一个队列存储，放入两个root。子问题为"队列取出两个节点值都相同"。入队时按root1.left,root2.right,root1.right,root2.left进行入队。
## 边界
 
## code
[SymmetricTree.java](SymmetricTree.java)

**Complexity Anlysis**

 - 时间：O(n)
 - 空间：O(n)