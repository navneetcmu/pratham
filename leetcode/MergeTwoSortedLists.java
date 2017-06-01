/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result, temp; 
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1; 
        
        if(l1.val<l2.val) {result = new ListNode(l1.val); temp=result; l1=l1.next;}
        else {result = new ListNode(l2.val); temp=result; l2=l2.next;}
        
        while(l1!=null || l2!=null){
            if(l1==null){
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            } 
            else if(l2==null){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }
            else if(l1.val<l2.val){
                    temp.next = new ListNode(l1.val);
                    l1 = l1.next;
                    temp = temp.next; 
            }
            else{
                    temp.next = new ListNode(l2.val);
                    l2 = l2.next;
                    temp = temp.next;
            }
        }
        return result; 
    }
}
