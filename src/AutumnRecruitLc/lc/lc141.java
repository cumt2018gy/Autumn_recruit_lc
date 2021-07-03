package AutumnRecruitLc.lc;

import model.ListNode;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/4 0:37
 */
public class lc141 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head , slow  = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }


}
