package _01_array._2_两数相加;

import _02_link.Node;

public class AddTwoNumbers {
    //提交解法
    public Node addTwoNumbers(Node l1, Node l2) {

        Node cursor = new Node(0);
        Node head = cursor;

        int addValue = 0;
        while(null != l1 || null != l2) {
            int l1_val = null != l1 ? l1.val : 0;
            int l2_val = null != l2 ? l2.val : 0;
            int sum = l1_val + l2_val + addValue;
            cursor.next = new Node(sum % 10);
            addValue = sum >= 10 ? 1 : 0;
            cursor = cursor.next;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if(addValue > 0) {
            cursor.next = new Node(addValue);
        }
        return head.next;
    }

    //代码优化后
    public Node addTwoNumbers_v2(Node l1, Node l2) {

        Node cursor = new Node(0);
        Node head = cursor;

        int addValue = 0;
        while(null != l1 || null != l2 || addValue > 0) {
            int l1_val = null != l1 ? l1.val : 0;
            int l2_val = null != l2 ? l2.val : 0;
            int sum = l1_val + l2_val + addValue;
            cursor.next = new Node(sum % 10);
            addValue = sum / 10;
            cursor = cursor.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return head.next;
    }

}
