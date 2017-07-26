//https://leetcode.com/problems/add-two-numbers/#/description

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = (l1.val+l2.val)%10; 
        int rem = (l1.val+l2.val)/10; 
        ListNode l3 = new ListNode(sum); 
        ListNode ans = l3, l4; 
        while(l1.next!=null && l2.next!=null){
             l1 = l1.next; 
             l2 = l2.next;
             sum = (l1.val+l2.val+rem)%10;
             rem = (l1.val+l2.val+rem)/10;
             l3.next = new ListNode(sum); 
             l3 = l3.next; 
        }
        //if both numbers are of same size end here.
        //check if any remainder is yet to be incorporated
        if(l1.next==null && l2.next==null){
           if(rem>0) l3.next = new ListNode(rem); 
           return ans;  
        }
        l4 = (l1.next==null) ? l2 : l1; 
        while(l4.next!=null){
            sum = (l4.next.val+rem)%10;
            rem = (l4.next.val+rem)/10;
            l3.next  = new ListNode(sum);
            l4=l4.next;
            l3=l3.next; 
        }
        //check if any remainder is yet to be incorporated
        if(rem>0) l3.next = new ListNode(rem);
        return ans; 
    }
}
