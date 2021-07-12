package _01_array._53_最大子序和;

public class MaxSubArray {
    //思路,以k结尾的最大子序列为：f(k) = max(f(k-1)+num[k], num[k])
    //申请临时数组记录所有结果值，再分别与最大值进行比较。
    public static int maxSubArray(int[] nums) {
        int [] maxArr = new int[nums.length];
        maxArr[0] = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++) {
            maxArr[i] = Math.max(maxArr[i-1]+nums[i], nums[i]);
            max = Math.max(max, maxArr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
