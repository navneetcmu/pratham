https://leetcode.com/problems/kth-smallest-element-in-a-bst/tabs/description/
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
    int count;
    int n;
    int ans; 
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        n=k; 
        traverse(root.left, n);
        count+=1;
        if(count==k) {ans=root.val;return ans;}
        traverse(root.right, n); 
        return ans; 
    }
    
    public void traverse(TreeNode root, int k){
        if(root==null) return;
        traverse(root.left, k);
        count+=1;
        if(count==k) {ans = root.val; return;}
        traverse(root.right, k); 
    }
}
