package _02_link._206_反转链表;


import _02_link.Node;

//TODO 待验证准确性
public class InorderTraversal {

    //普通方式
    public Node revert(Node head) {
        if(head.next == null) {
            return head;
        }
        Node pre = null;
        Node cur = head;
        Node after = head.next;
        while(after != null) {
            cur.next = pre;
            pre = cur;
            cur = after;
            after = after.next;
        }
        return cur;

    }

    //递归方式
    public Node revert(Node pre, Node cur, Node after) {
        if(after == null) {
            return cur;
        }
        cur.next = pre;
        return revert(cur, after, after.next);
    }

}
