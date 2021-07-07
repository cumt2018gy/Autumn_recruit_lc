package AutumnRecruitLc.jianZhi;

import model.ListNode;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/7 23:04
 */
public class jz22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, fast = head;
        while (k-- > 0) fast = fast.next;
        while (fast != null ) {
            fast  = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
