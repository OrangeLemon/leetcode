package _01_array._295_数据流的中位数;

import java.util.*;

class MedianFinder {
    private PriorityQueue<Integer> maxheap;
    private PriorityQueue<Integer> minheap;

    /** initialize your data structure here. */
    public MedianFinder() {
        maxheap = new PriorityQueue<>((x,y)->y-x);
        minheap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(maxheap.isEmpty()) {
            maxheap.add(num);
            return;
        }
        if(maxheap.size() == minheap.size()) {
            if(num < maxheap.peek()) {
                maxheap.add(num);
            } else {
                minheap.add(num);
            }
        } else if(maxheap.size() > minheap.size()) {
            if(num > maxheap.peek()) {
                minheap.add(num);
            } else {
                minheap.add(maxheap.peek());
                maxheap.poll();
                maxheap.add(num);
            }
        } else if(maxheap.size() < minheap.size()) {
            if(num < minheap.peek()) {
                maxheap.add(num);
            } else {
                maxheap.add(minheap.peek());
                minheap.poll();
                minheap.add(num);
            }
        }
    }

    public double findMedian() {
        if(maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek())/2.0;
        } else if(maxheap.size() > minheap.size()) {
            return maxheap.peek();
        } else {
            return minheap.peek();
        }
    }



    public static void main(String[] args) {
//        MedianFinder finder = new MedianFinder();
//        finder.addNum(1);
//        finder.addNum(2);
//        System.out.println(finder.findMedian());
        //System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
//        List<List<Integer>> treeSum = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        treeSum.forEach(System.out::println);
//        System.out.println(reverseBits(4294967293));
    }

    public static int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        s = new String(arr);
        for(int k=0;k<(32-s.length());k++) {
            s += "0";
        }
        return Integer.parseInt(s);
    }



    public static int titleToNumber(String s) {
        if(null == s || s.length() == 0) return 0;
        char[] arr = s.toCharArray();
        int result = 0;
        int temp = 1;
        for(int i=arr.length-1;i>0;i--) {
            int cur = Integer.valueOf(arr[i]) - 64;
            result = cur * temp + result;
            temp *= 26;
        }
        return result;
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        int len = strs[0].length();
        int idx = 0;
        for(int i = 1; i < strs.length; i++) {
            if(strs[i].length() < len) {
                idx = i;
                len = strs[i].length();
            }
        }
        int l = 0;
        for(int i = 0; i < len;i++) {
            for(int j = 0; j < strs.length;j++) {
                if(strs[j].charAt(i) != strs[idx].charAt(i)) {
                    return strs[idx].substring(0, l);
                }
            }
            l++;
        }
        return strs[idx].substring(0, l);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        if(nums == null || nums.length == 0) {
            return list;
        }
        Arrays.sort(nums);
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++) {
            int j = i + 1, k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> l = new ArrayList();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    map.put("" + nums[i] + nums[j] + nums[k], l);
                    j++;
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(map.values());
    }

}

