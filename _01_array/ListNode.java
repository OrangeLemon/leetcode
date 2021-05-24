package _01_array;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }


    public static ListNode init(int[] arr) {
        if (null == arr || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void print(ListNode node) {
        ListNode cur = node;
        while(cur != null) {
            System.out.println(cur.val + ",");
            cur = cur.next;
        }
    }
}
