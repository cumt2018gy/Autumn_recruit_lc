package model;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/4 0:39
 */
public class ListNode {

    public int val;
    public ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
    public ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
}
