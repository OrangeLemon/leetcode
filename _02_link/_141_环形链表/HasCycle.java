package _02_link._141_环形链表;


import _02_link.ListNode;

public class HasCycle {
    //思路：快慢指针，快指针走2步，慢指针走1步，在链表结束前，如果快指针能追上慢指针，说明链中有环存在
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(null == head || head.next == null) return false;
            ListNode slow = head;
            ListNode fast = head;
            while(slow.next != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }
}
