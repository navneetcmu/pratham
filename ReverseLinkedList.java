/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nxt, vw;
        if(head==null) return null; 
        if(head.next==null) return head;
        nxt = head.next;
        vw = head.next; 
        head.next = null; 
        while(vw.next!=null){
        	vw = vw.next;
        	nxt.next = head;
        	head = nxt; 
        	nxt = vw; 
        }
        nxt.next = head;
        head = nxt; 
        return head; 
    }
}
