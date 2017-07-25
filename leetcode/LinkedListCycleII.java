
// https://leetcode.com/problems/linked-list-cycle-ii/#/description

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return null; 
        ListNode fast, slow;
        fast = head; slow = head; 
        while(fast!=null){
            if(fast.next==null) return null; 
            fast=fast.next.next; 
            slow=slow.next;
            if(fast==slow){
                slow = head;
                while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                }
                return slow; 
            } 
        }
        return null; 
    }
}
