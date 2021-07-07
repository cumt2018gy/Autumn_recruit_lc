package AutumnRecruitLc.lc;

import model.ListNode;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/7 23:13
 */
public class lc19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow, fast, res;
         fast =head;
         slow  = dummy;
        while (n-- > 0) {
            fast = fast.next;
        }

        while (fast != null){
            fast  = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        res = dummy.next;
        return res;
    }
}
