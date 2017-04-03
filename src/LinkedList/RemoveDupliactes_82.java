package LinkedList;

import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/17/17
 */
public class RemoveDupliactes_82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;

        while (head.next != null && head.next.next != null) {
            if (head.next.val == head.next.next.val) {
                int val = head.next.val;
                while (head.next != null && head.next.val == val) {
                    head.next = head.next.next;
                }
            } else {
                head = head.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next = new ListNode(2);
        ListNode ret = deleteDuplicates(head);
        System.out.println(ret);
    }
}
