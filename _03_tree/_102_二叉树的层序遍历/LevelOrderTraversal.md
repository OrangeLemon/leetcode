# 二叉树的层序遍历【中等】
<https://leetcode-cn.com/problems/binary-tree-level-order-traversal/>

## 知识点
- BFS
- Queue的基本操作
    * offer/add 添加；队列满了，add抛出异常，offer返回false；
    * poll/remove 返回并删除第一个节点，空集合remove抛异常，poll返回null；
    * peek/element 返回第一个节点，区别同上。
 
## 思路
 1. 使用BFS广度搜索遍历
 2. 队列存储，两层循环。外层判断循环结束，内层循环遍历每一层的节点。
## 边界
 
## code
[LevelOrderTraversal.java](LevelOrderTraversal.java)

**Complexity Anlysis**

 - 时间：O(n)
 - 空间：O(n)
