# 两数之和【简单】
<https://leetcode-cn.com/problems/two-sum/>

## 知识点
- hashMap
 
## 思路
 1. 将数组按<值,下标>的格式存入map中
 2. hashMap的get方法时间复杂度为 O(1)
 3. 这一题坑爹的地方在于，不能使用同一个元素，以及不同下标的元素值可能一样。所以不能简单地把所有元素放入Map中查找。
 4. 遍历数组，将遍历过的元素放入map中，判断当前元素 + map中存在的某个元素 是否满足要求。
 5. 遍历过的数据都在map中，未遍历的数据在数组中，获取下标的复杂度都是1。
## 边界
 
## code
[TwoSum.java](TwoSum.java)

**Complexity Anlysis**

 - 时间：O(n)
 - 空间：O(n)
