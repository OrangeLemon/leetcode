# 二叉树的最大深度【简单】
<https://leetcode-cn.com/problems/maximum-depth-of-binary-_02_tree/>

##知识点
- root不为null深度为1，否则为0，多一个子节点深度+1。
  
- 递归与迭代：递归是自己调用自己，每次旨在缩小问题规模。迭代是自己执行很多次，每次旨在更接近目标。

- 迭代与循环：循环侧重于描述每次操作和上一次操作相同之处，而迭代侧重于描述每次操作和上一次操作的不同之处。

- DFS（前中后），BFS
 
##思路
- 方法一：递归求Max(左子树高度，右子树高度) + 1，结束条件node为null返回0。

- 方法二：迭代，DFS（中），栈实现，先进后出。

- 方法三：迭代，DFS，队列实现，先进先出。
##边界
 
##code
[MaxDepthOfBinaryTree.java](MaxDepthOfBinaryTree.java)

**Complexity Anlysis**

 - 时间：
 - 空间：
 
|方法|时间复杂度|空间复杂度|
|----| ----|----|
|一|O(n)|O(log n ~ n)|
|二|O(n)|O(log n ~ n)|
|三|O(n)|O(n)|