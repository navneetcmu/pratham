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
    int depth=0, dr=0, dl=0; 
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        depth = 1+ mx(maxDepth(root.right), maxDepth(root.left)); 
        return depth; 
    }
    
    public int mx(int a, int b){
        if(a>=b) return a;
        return b; 
    }
}
