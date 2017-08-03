// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
/**
The main problem is that we don't know size of the LinkedList, otherwise problem would be very easy. 
So we will use a runner node and traverse it on the likedist such that distance between it and current node is n. 
The we will traverse till node so that current node becomes n nodes from back. We are using prev node to track one node before 
current node. 
Rest is easy prev.next=current.next. But beware of one special case, where current is head. Here prev=current. So we will current.next
as new head. 
**/

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head; 
        ListNode cur, prev, runr;
        cur=head; prev=head; runr=head; 
        
        //maintaining "n" distance between runr and cur node. 
        for(int i=1; i<n; i++){
            runr = runr.next; 
        }
        
        //traversing till end so that cur node becomes n from node. 
        while(runr.next!=null){
            runr = runr.next;
            prev= cur; 
            cur = cur.next; 
        }
        
        if(prev==cur) head=cur.next; 
        else {prev.next=cur.next;}  
        return head; 
    }
}
