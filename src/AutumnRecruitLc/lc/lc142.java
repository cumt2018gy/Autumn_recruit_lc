package AutumnRecruitLc.lc;

import model.ListNode;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/4 0:42
 */
public class lc142 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head , slow  = head;
        boolean f = false;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                f = true;
                break;
            }
        }
        if (!f) return null;
        slow = head;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
