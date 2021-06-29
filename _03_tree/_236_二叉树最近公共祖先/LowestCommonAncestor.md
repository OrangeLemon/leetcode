# 首个共同祖先【中等】
<https://leetcode-cn.com/problems/first-common-ancestor-lcci/>

## 知识点
- 递归查找，搜索祖先路径，找到返回true，否则返回false。
- 剪枝，返回false的节点需要删掉。
 
## 思路
 1. 分别查询从根节点到两个节点的路径，存入数组中。
 2. 比较两个数组，返回第一个不相同的元素的上一个元素，即为首个相同祖先。
## 边界
 
## code
[LowestCommonAncestor.java](LowestCommonAncestor.java)

**Complexity Anlysis**

 - 时间：O(N)
 - 空间：O(N)