/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode curr, nxt;
    boolean flag=false; 
    public void deleteNode(ListNode node) {
        curr = node;
        while(curr.next!=null){
            curr.val = (curr.next).val;
            if((curr.next).next==null) {curr.next=null; return;}  
            curr = curr.next; 
        }
    }
}
