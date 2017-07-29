//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

public class Solution {
    List<List<Integer>> ans;
    List<Integer> lst; 
    public List<List<Integer>> levelOrder(TreeNode root) {
         
        ans = new LinkedList<List<Integer>>();
        if(root==null) return ans;
        lst = new LinkedList<Integer>(); 
        lst.add(root.val);
        ans.add(0, lst); 
        traverse(root.left, 1); 
        traverse(root.right, 1); 
        return ans; 
    }
    
    public void traverse(TreeNode node, int k){
        //System.out.println("I gog here with k "+k);
        if(node==null) return;
        //System.out.println("I go here with k "+k);
        //follwoing try-catch also works 
        /**
        try{
            System.out.println("Try block "+node.val);
            lst = ans.remove(k); 
            lst.add(node.val);
            ans.add(k, lst);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Catch block "+node.val);
            lst = new LinkedList<Integer>();
            lst.add(node.val);
            ans.add(lst); 
        }
        
        **/
        if(k>ans.size()-1) {
            //System.out.println("I am here");
            lst = new LinkedList<Integer>();
            lst.add(node.val); 
            ans.add(lst);
        }
        else{
            lst = ans.remove(k); 
            lst.add(node.val);
            ans.add(k, lst); 
        }
        //**/
        traverse(node.left, k+1);
        traverse(node.right, k+1); 
    }
}
