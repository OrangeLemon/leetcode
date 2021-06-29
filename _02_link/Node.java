package _02_link;

public class Node {
    public int val;
    public Node next;

    public Node(int x) {
        val = x;
    }


    public static Node init(int[] arr) {
        if (null == arr || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new Node(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void print(Node node) {
        Node cur = node;
        while(cur != null) {
            System.out.println(cur.val + ",");
            cur = cur.next;
        }
    }
}
