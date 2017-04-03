package LinkedList;

/**
 * @Author RenXintao
 * @Date 3/17/17
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class RemoveDupliactes_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next = new ListNode(2);
        ListNode ret = deleteDuplicates(head);
        System.out.println(ret);
    }
}
