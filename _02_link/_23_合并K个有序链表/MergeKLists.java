package _02_link._23_合并K个有序链表;

import _02_link.ListNode;

/**
 * Description:思路一：迭代法  思路二：二分排序法
 * Created by linmanyun on 2021/5/22 下午10:14.
 */
public class MergeKLists {

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[]{
                ListNode.init(new int[]{1, 3, 4}),
                ListNode.init(new int[]{5}),
                ListNode.init(new int[]{1,7,9}),
                ListNode.init(new int[]{1,7,99})
        };
        ListNode result = mergeKLists(lists);
        ListNode.print(result);

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        //找到最小的头结点
        //合并最小的头结点和其余的链表
        if (null == lists) return null;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        //判断lists中的链表是否为[]
        while (isNotNull(lists)) {
            cur.next = minHead(lists);
            cur = cur.next;
        }
        return head.next;
    }

    static boolean isNotNull(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (null != lists[i]) {
                return true;
            }
        }
        return false;
    }

    static ListNode minHead(ListNode[] lists) {
        ListNode minNode = null;
        int minIndex = -1;
        for (int i = 0; i < lists.length; i++) {
            if (null != lists[i] && null == minNode) {
                minNode = lists[i];
                minIndex = i;
            } else if (null != lists[i] && minNode.val > lists[i].val) {
                minNode = lists[i];
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            lists[minIndex] = lists[minIndex].next;
        }
        return minNode;
    }
}
