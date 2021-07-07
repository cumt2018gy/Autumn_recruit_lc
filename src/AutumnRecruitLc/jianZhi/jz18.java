package AutumnRecruitLc.jianZhi;

import model.ListNode;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/7 23:25
 */
public class jz18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow, fast, res;
        fast = head;
        slow  = dummy;

        while (fast != null && fast.val != val  ){
            fast  = fast.next;
            slow = slow.next;
        }
        if (slow.next != null)
        slow.next = slow.next.next;
        res = dummy.next;
        return res;
    }
}
