package LinkedList;

/**
 * @Author RenXintao
 * @Date 3/17/17
 */
public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
    public static void main(String[] args) {

    }
}
