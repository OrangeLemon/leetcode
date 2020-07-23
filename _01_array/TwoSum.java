package _01_array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(null == nums) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target - nums[i])) {
                //注意此处数组的顺序，满足条件时，map中的值是之前放入的，下标较小
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;

    }


    /*
    //错误解法一，没有看到题目中不让使用相同元素
    //输入
    //[3,2,4]
    //6
    //输出：
    //[0,0]
    //预期：
    //[1,2]

    public int[] twoSum(int[] nums, int target) {
        if(null == nums) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - nums[i];
            if (map.containsKey(num1) && map.containsKey(num2)) {
                return new int[]{map.get(num1), map.get(num2)};
            }
        }
        return null;
    }
    }*/

    /*
    //错误解法二，没有考虑不同下标的值可能是一样的
    //输入
    //[3,3]
    //6
    //输出：
    //null
    //预期：
    //[0,1]
    public static int[] twoSum(int[] nums, int target) {
        if(null == nums) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - nums[i];
            if (num1 != num2 && map.containsKey(num1) && map.containsKey(num2)) {
                return new int[]{map.get(num1), map.get(num2)};
            }
        }
        return null;
    }*/

    /*
    //错误解法三，值相同元素在map中为同一值，没有考虑不同下标的值可能是一样的
    public static int[] twoSum(int[] nums, int target) {
        if(null == nums) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - nums[i];
            if (map.containsKey(num1) && map.containsKey(num2) && map.get(num1) != map.get(num2)) {
                return new int[]{map.get(num1), map.get(num2)};
            }
        }
        return null;
    }*/

}
