package _02_link._23_合并K个有序链表;

import _02_link.Node;

/**
 * Description:思路一：迭代法  思路二：二分排序法
 * Created by linmanyun on 2021/5/22 下午10:14.
 */
public class MergeKLists {

    public static void main(String[] args) {
        Node[] lists = new Node[]{
                Node.init(new int[]{1, 3, 4}),
                Node.init(new int[]{5}),
                Node.init(new int[]{1,7,9}),
                Node.init(new int[]{1,7,99})
        };
        Node result = mergeKLists(lists);
        Node.print(result);

    }

    public static Node mergeKLists(Node[] lists) {
        //找到最小的头结点
        //合并最小的头结点和其余的链表
        if (null == lists) return null;
        Node head = new Node(-1);
        Node cur = head;
        //判断lists中的链表是否为[]
        while (isNotNull(lists)) {
            cur.next = minHead(lists);
            cur = cur.next;
        }
        return head.next;
    }

    static boolean isNotNull(Node[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (null != lists[i]) {
                return true;
            }
        }
        return false;
    }

    static Node minHead(Node[] lists) {
        Node minNode = null;
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
