package _01_array._2_两数相加;

import _01_array.ListNode;

public class AddTwoNumbers {
    //提交解法
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cursor = new ListNode(0);
        ListNode head = cursor;

        int addValue = 0;
        while(null != l1 || null != l2) {
            int l1_val = null != l1 ? l1.val : 0;
            int l2_val = null != l2 ? l2.val : 0;
            int sum = l1_val + l2_val + addValue;
            cursor.next = new ListNode(sum % 10);
            addValue = sum >= 10 ? 1 : 0;
            cursor = cursor.next;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if(addValue > 0) {
            cursor.next = new ListNode(addValue);
        }
        return head.next;
    }

    //代码优化后
    public ListNode addTwoNumbers_v2(ListNode l1, ListNode l2) {

        ListNode cursor = new ListNode(0);
        ListNode head = cursor;

        int addValue = 0;
        while(null != l1 || null != l2 || addValue > 0) {
            int l1_val = null != l1 ? l1.val : 0;
            int l2_val = null != l2 ? l2.val : 0;
            int sum = l1_val + l2_val + addValue;
            cursor.next = new ListNode(sum % 10);
            addValue = sum / 10;
            cursor = cursor.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return head.next;
    }

}
