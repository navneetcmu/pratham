/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int[] nums; 
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null; 
        this.nums = nums; 
        int mid = (nums.length)/2;
        int lo=0, hi=nums.length-1;   
        TreeNode head = new TreeNode(nums[mid]);
        head.left = func(head.left, lo, mid-1);
        head.right = func(head.right, mid+1, hi); 
        return head; 
    }
    
    public TreeNode func(TreeNode node, int lo, int hi){
        if(lo>hi) return null;
        if(lo==hi){
            node = new TreeNode(nums[hi]); 
            return node; 
        }
        int mid = (hi+lo)/2;
        node = new TreeNode(nums[mid]); 
        node.left = func(node.left, lo, mid-1);
        node.right = func(node.right, mid+1, hi); 
        return node; 
    }
}
