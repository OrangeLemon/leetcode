package _02_link._206_反转链表;


import _02_link.ListNode;

//TODO 待验证准确性
public class InorderTraversal {

    //普通方式
    public ListNode revert(ListNode head) {
        if(head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

    //递归方式，理解错误，这不是递归
    public ListNode revert(ListNode pre, ListNode cur, ListNode after) {
        if(after == null) {
            return cur;
        }
        cur.next = pre;
        return revert(cur, after, after.next);
    }

}
