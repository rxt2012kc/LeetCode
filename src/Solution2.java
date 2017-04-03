/**
 * @Author RenXintao
 * @Date 2/10/17
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }

        ListNode result = new ListNode(0);
        ListNode head = null;
        int sum, flag = 0;

        while(l1 != null || l2 != null || flag != 0) {
            // l2节点为空
            if(l1 != null && l2 == null) {
                sum = l1.val + flag;
            // l1节点为空
            } else if (l1 == null && l2 != null) {
                sum = l2.val + flag;
            // l1和l2节点都为空，前一项的和>9
            } else if (l1 == null && l2 == null && flag != 0) {
                sum = flag;
            // 都不为空
            } else {
                sum = l1.val + l2.val + flag;
            }
            // 两项和>9，flag为1；否则为0；
            if(sum > 9) {
                sum = sum % 10;
                flag = 1;
            } else {
                flag = 0;
            }
            // 链表中添加节点
            if (head != null) {
                head.next = new ListNode(sum);
                head = head.next;
            } else {
                head = new ListNode(sum);
                result = head;
            }
            // 遍历l1节点
            if(l1 != null) {
                l1 = l1.next;
            }
            // 遍历l2节点
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        ListNode l1 = head1;
        head1.next = new ListNode(4);
        head1 = head1.next;
        head1.next = new ListNode(3);
        ListNode head2 = new ListNode(5);
        ListNode l2 = head2;
        head2.next = new ListNode(6);
        head2 = head2.next;
        head2.next = new ListNode(7);

        ListNode ret = addTwoNumbers(l1, l2);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }
}
