# 两数相加【中等】
<https://leetcode-cn.com/problems/add-two-numbers/>

## 知识点
- 链表基本操作
 
## 思路
 1. 用一个单独的链表存储每次相加结果 
 2. 初始化的情况，可默认第一个节点为0，最后结果返回第二个节点，方便逻辑统一。
 3. 相加过程涉及两个值:
    - 当前值：（l1.val + l2.val + 上次进位值 ）% 10;
    - 进位值：（l1.val + l2.val + 上次进位值 ）/ 10;

## 边界
1. 两个链表都走到头了，但还剩余进位值不为0。
2. 统一结束条件，两个链表不为空&&进位值不为0。
 
## code
[AddTwoNumbers.java](AddTwoNumbers.java)

**Complexity Anlysis**

 - 时间：O(max(m,n))
 - 空间：O(max(m,n))
